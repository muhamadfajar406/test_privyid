package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.Register;

public class Registersteps {

    @Steps
    Register register;

    @Given("I am Test api register")
    public void iAmTestApiRegister() {


    }


    @When("I enter phone number")
    public void iEnterPhoneNumber() {
        register.setBodyReq();

    }

    @When("I click execution button")
    public void iClickExecutionButton() {
        register.hitEndpointLogin();

    }

    @Then("Api register succesfuly")
    public void apiRegisterSuccesfuly() {

        register.valDateEndpointLogin();
    }
}
