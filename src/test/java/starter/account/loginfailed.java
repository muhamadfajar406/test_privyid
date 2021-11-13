package starter.account;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginfailed {

    @Given("I am on the Login Page failed username")
    public void i_am_on_the_login_failed() {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        System.out.println("gagal");

    }

    @When("I enter wrong my username")
    public void i_enter_my_username_and_password_wrong() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("I click {string} button failed username")
    public void i_click_button_wrong(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }


    @Then("I am taken to the dashboard failed username")
    public void i_am_taken_to_the_dashboard_wrong() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }



}
