package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.Getprofile;

public class Getprofilesteps {
    @Steps
    Getprofile getprofile;

    @Given("I am Test api getprofile")
    public void i_am_Test_api_getprofile() {

        getprofile.setBodyReq();

    }

    @When("I am login")
    public void i_am_login() {
        getprofile.hitEndpointLoginUser();
    }

    @When("I cLick execution Button")
    public void i_cLick_execution_Button() {
        getprofile.hitEndpointprofileUser();
    }

    @Then("Api get succesfuly")
    public void api_get_succesfuly() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }




}
