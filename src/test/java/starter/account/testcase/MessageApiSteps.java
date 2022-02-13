package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.MessagePost;

public class MessageApiSteps {
    @Steps
    MessagePost messagePost;

    @Given("I am Test api Message Api")
    public void IamTestapiMessageApi() {
       messagePost.setBodyReq();

    }

    @When("I am login again Message Api")
    public void IamloginagainMessageApi() {
        messagePost.hitEndpointLoginUser();

    }
    @When("I am  Get Message Api")
    public void IamGetMessageApi() {
       messagePost.hitEndpointCreateOrder();

    }
    @Then("I am Test Get Message Api succesfully")
    public void IamTestGetMessageApisuccesfully() {

    }




}
