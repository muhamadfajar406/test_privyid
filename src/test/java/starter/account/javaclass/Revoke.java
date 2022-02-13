package starter.account.javaclass;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

public class Revoke {

    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String access_token;

    @Step
    public void setBodyReq() { //Valid Email And Password
        requestParams = new JSONObject();
        requestParams.put("phone", "089652438891");
        requestParams.put("password", "fajar406");
        requestParams.put("latlong", "232323");
        requestParams.put("device_token","276353");
        requestParams.put("device_type","0");
    }

    @Step
    public void hitEndpointLoginUser() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.signin)
                .then()
                .statusCode(201);

        access_token = SerenityRest
                .then()
                .extract()
                .path("data.user.access_token");

    }

    @Step
    public void hitEndpointprofileUser() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Content-Type","multipart/form-data")
                .multiPart("access_token",""+access_token)
                .multiPart("confirm","1")
                .when()
                .post(endpoint.revoke)
                .then()
                .statusCode(200);

    }




}
