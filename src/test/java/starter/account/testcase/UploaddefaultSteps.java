package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.Uploaddefault;

public class UploaddefaultSteps {

    @Steps
    Uploaddefault uploaddefault;

    @Given("I am upload image api profile default")
    public void Iamuploadimageapiprofiledefault() {
        uploaddefault.setBodyReq();

    }

    @When("I am login again for upload image profile default")
    public void Iamloginagainforuploadimageprofiledefault() {
        uploaddefault.hitEndpointLoginUser();
        uploaddefault.hitEndpointSendInvoice();

    }
    @When("I click excution api upload image profile default")
    public void Iclickexcutionapiuploadimageprofiledefault() {
       uploaddefault.hitEndpointDefault();

    }
    @Then("Otp upload image profile default")
    public void Otpuploadimageprofiledefault() {

    }

}
