package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.ProfileEducations;

public class ProfileeducationSteps {

    @Steps
    ProfileEducations profileEducations;

    @Given("I am Test api profile educataion")
    public void IamTestapiprofileeducataion() {
        profileEducations.setBodyReq();


    }

    @When("I am login again forprofile educataion")
    public void Iamloginagainforprofileeducataion() {
        profileEducations.hitEndpointLoginUser();

    }
    @When("I am  post profile educataion")
    public void Iampostprofileeducataion() {
       profileEducations.hitEndpointCreateOrder();

    }
    @Then("I am test api profile educataion sucessfully")
    public void Iamtestapiprofileeducataionsucessfully() {

    }

}
