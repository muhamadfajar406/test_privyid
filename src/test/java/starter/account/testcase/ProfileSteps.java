package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.ProfilesApi;

public class ProfileSteps {

    @Steps
    ProfilesApi profilesApi;

    @Given("I am Test api profile Api")
    public void IamTestapiprofileApi() {
       profilesApi.setBodyReq();

    }

    @When("I am login again forprofile api")
    public void Iamloginagainforprofileapi() {
       profilesApi.hitEndpointLoginUser();

    }
    @When("I am  post profile")
    public void Iampostprofile() {
       profilesApi.hitEndpointCreateOrder();

    }
    @Then("I am test api profile api sucessfully")
    public void Iamtestapiprofileapisucessfully() {

    }

}
