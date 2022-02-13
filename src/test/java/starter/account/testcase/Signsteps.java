package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.Signinjava;

public class Signsteps {
    @Steps
    Signinjava signinjava;


    @Given("I am Test api sign")
    public void iAmTestApiSign() {


    }

    @When("I enter phone number and password")
    public void iEnterPhoneNumberAndPassword() {
        signinjava.setBodyReq();
    }

    @When("I cLick execution button")
    public void iCLickExecutionButton() {
        signinjava.hitEndpointLogin();
    }

    @Then("Api sign succesfuly")
    public void apiSignSuccesfuly() {
    }

}
