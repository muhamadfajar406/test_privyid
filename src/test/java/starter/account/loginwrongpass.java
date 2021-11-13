package starter.account;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginwrongpass {

    @Given("I am on the login page pass")
    public void i_am_on_the_login_failedp() {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        System.out.println("gagal");

    }

    @When("I enter wrong my pass")
    public void i_enter_my_username_and_password_wrongp() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("I click 'Login' button pass")
    public void salah() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }



    @Then("I am taken to dashbord failed wrong pass")
    public void i_am_taken_to_the_dashboard_wrongp() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }



}
