package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.Register;
import starter.account.javaclass.RegisterOtpRequest;

public class OtprequestSteps {

    @Steps
    RegisterOtpRequest register;
    @Given("I am Test api Otp RequesT")
    public void iAmTestApiOtpRequesT() {
    }

    @When("I am enter phone number Registered beforE")
    public void iAmEnterPhoneNumberRegisteredBeforE() {
        register.setBodyReq();
    }

    @When("I Click execution ButtoN")
    public void iClickExecutionButtoN() {
        register.hitEndpointLogin();
    }

    @Then("Otp deliverY")
    public void otpDeliverY() {
        register.valDateEndpointLogin();

    }
}
