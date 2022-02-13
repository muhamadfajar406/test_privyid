package starter.account.javaclass;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

public class MessageGet {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String access_token;
    String Id;

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
    public void hitpointuserid() {
        SerenityRest
                .given()
                .header("Accept", "application/json")
                .header("Content-Type","multipart/form-data")
                .multiPart("phone","089652438891")
                .when()
                .post(endpoint.Otprequest)
                .then()
                .statusCode(201);
        Id = SerenityRest
                .then()
                .extract()
                .path("data.user.id");

    }

    public void hitEndpointCreateOrder() {
        SerenityRest
                .given()
                .header("Accept", "application/json")
                .header("Authorization", "Bearer "+access_token)
                .header("Content-Type","multipart/form-data")
                .when()
                .get(endpoint.Getmessagereal+Id)
                .then()
                .statusCode(200);
    }




}
