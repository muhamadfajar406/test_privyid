package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.Uploadimage;

public class UploadimageSteps {
    @Steps
    Uploadimage uploadimage;


    @Given("I am upload image api profile")
    public void Iamuploadimageapiprofile() {
       uploadimage.setBodyReq();

    }

    @When("I am login again for upload image profile")
    public void Iamloginagainforuploadimageprofile() {
      uploadimage.hitEndpointLoginUser();

    }
    @When("I click excution api upload image profile")
    public void Iclickexcutionapiuploadimageprofile() {
        uploadimage.hitEndpointSendInvoice();

    }
    @Then("Otp upload image profile")
    public void Otpuploadimageprofile() {

    }

}
