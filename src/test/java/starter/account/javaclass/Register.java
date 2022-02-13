package starter.account.javaclass;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Register {

    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;

    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("phone", "0896524389"+endpoint.angka);
        requestParams.put("password", "83r5^_");
        requestParams.put("country", "indonesia");
        requestParams.put("latlong", "98765678");
        requestParams.put("device_token", "88765678");
        requestParams.put("device_type", "0");

    }

    @Step
    public void hitEndpointLogin()
    {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.register)
                .then()
                .statusCode(201);
    }

    @Step
    public void valDateEndpointLogin() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/login.json"));
    }








}
