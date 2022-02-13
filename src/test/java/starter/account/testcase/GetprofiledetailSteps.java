package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.Getprofiledetail;

public class GetprofiledetailSteps {

    @Steps
    Getprofiledetail getprofiledetail;

    @Given("I am Test api getprofiledescriptions")
    public void IamTestapigetprofiledescriptions() {
       getprofiledetail.setBodyReq();

    }

    @When("I am login again forgetprofiledescriptions")
    public void Iamloginagainforgetprofiledescriptions() {
        getprofiledetail.hitEndpointLoginUser();

    }
    @When("I am  Get profile")
    public void IamGetprofile() {
       getprofiledetail.hitEndpointprofileUser();

    }
    @Then("I am Tes Get profile api sucessfully")
    public void IamTesGetprofileapisucessfully() {
        getprofiledetail.valDateprofiledetail();

    }

}
