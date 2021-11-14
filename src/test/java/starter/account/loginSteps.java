package starter.account;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginSteps {

    @Steps
    login login;

    @Given("I am on the Login page")
    public void i_am_on_the_Login_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//        login.hitEndpointLoginRA();
    }

    @When("I enter my username and Password correctly")
    public void i_enter_my_username_() {
        login.setBodyReq();
    }

    @When("I click {string} buttom")
    public void i_click_buttom(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        login.hitEndpointLogin();
    }

    @Then("I am taken to the dashboard")
    public void i_am_taken() {
//        login.valDateEndpointLogin();
    }
}

