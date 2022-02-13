package starter.account.javaclass;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.utils.Endpoint;

public class Otpmatchregister {
    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String id;

    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("phone", "089652438892");

    }

    @Step
    public void hitEndpointLogin()
    {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.Otprequest)
                .then()
                .statusCode(201);

        id = SerenityRest
                .then()
                .extract()
                .path("data.user.id");
    }

    @Step
    public void hitpointmatch() {
        SerenityRest
                .given()
                .header("Accept", "application/json")
                .header("Content-Type","multipart/form-data")
                .multiPart("user_id",""+id)
                .multiPart("otp_code","89765343")
                .when()
                .post(endpoint.otpmatch)
                .then()
                .statusCode(201);

    }



    }




