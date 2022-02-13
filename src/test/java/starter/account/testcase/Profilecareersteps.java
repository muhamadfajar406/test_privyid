package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.Profilecareerapi;

public class Profilecareersteps {
  @Steps
    Profilecareerapi profilecareerapi;

    @Given("I am Test api profile career")
    public void iAmTestApiProfileCareer() {
        profilecareerapi.setBodyReq();

    }

    @When("I am login again forprofile career")
    public void Iamloginagainforprofilecareer() {
        profilecareerapi.hitEndpointLoginUser();

    }
    @When("I am  post profile career")
    public void Iampostprofilecareer() {
        profilecareerapi.hitEndpointCreateOrder();

    }
    @Then("I am test api profile career sucessfully")
    public void Iamtestapiprofilecareersucessfully() {

    }



}
