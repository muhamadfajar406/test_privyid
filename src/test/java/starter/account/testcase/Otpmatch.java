package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.Otpmatchregister;

public class Otpmatch {
    @Steps
    Otpmatchregister otpmatchregister;

    @Given("I am Match Otp")
    public void iAmMatchOtp() {
        otpmatchregister.setBodyReq();



    }

    @When("I am enter Otp")
    public void iAmEnterOtp() {
        otpmatchregister.hitEndpointLogin();
    }

    @When("I click Execution button")
    public void iClickExecutionButton() {
        otpmatchregister.hitpointmatch();
    }

    @Then("Otp match")
    public void otpMatch() {
    }
}
