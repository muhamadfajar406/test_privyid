package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.Revoke;

public class RevokeSteps {

    @Steps
    Revoke revoke;


    @Given("I am Test api Revoke or logout")
    public void iAmTestApiRevokeLogout() {
        revoke.setBodyReq();

    }


    @When("I am login again")
    public void iAmLoginAgain() {
        revoke.hitEndpointLoginUser();
    }


    @When("I am logout or revoke")
    public void iAmLogoutRevoke() {
        revoke.hitEndpointprofileUser();
    }


    @Then("I am test revoke logout")
    public void iAmTestRevokeLogout() {
    }


}
