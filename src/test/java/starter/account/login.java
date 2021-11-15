package starter.account;

import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class login {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;






    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("userName", "muhamadfajar"+endpoint.huruf+endpoint.huruf2);
        requestParams.put("password", "Bismilah@3"+endpoint.huruf+endpoint.huruf2);

    }

    @Step
    public void hitEndpointLogin()
    {
        SerenityRest
                .given()
                    .header("Content-Type", "application/json")
                    .body(requestParams.toString())
                .when()
                    .post(endpoint.LOGIN)
                .then()
                    .statusCode(201);
    }

    @Step
    public void hitEndpointLoginRA() {
        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.LOGIN)
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
