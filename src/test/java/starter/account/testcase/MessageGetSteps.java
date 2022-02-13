package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.MessageGet;

public class MessageGetSteps {
    @Steps
    MessageGet messageGet;



    @Given("I am Test api Message Get Api")
    public void IamTestapiMessageGetApi() {
        messageGet.setBodyReq();

    }

    @When("I am login again Message Get Api")
    public void IamloginagainMessageGetApi() {
        messageGet.hitEndpointLoginUser();
        messageGet.hitpointuserid();

    }
    @When("I am  Get Message Get Api")
    public void IamGetMessageGetApi() {
        messageGet.hitEndpointCreateOrder();

    }
    @Then("I am Test Get Message Get Api succesfully")
    public void IamTestGetMessageGetApisuccesfully() {

    }



}
