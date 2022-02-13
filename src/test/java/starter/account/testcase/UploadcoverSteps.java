package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.UploadImageCover;

public class UploadcoverSteps {
    @Steps
    UploadImageCover uploadImageCover;

    @Given("I am upload image api cover")
    public void Iamuploadimageapiprofile() {
        uploadImageCover.setBodyReq();

    }

    @When("I am login again for upload image cover")
    public void Iamloginagainforuploadimageprofile() {
        uploadImageCover.hitEndpointLoginUser();

    }
    @When("I click excution api upload image cover")
    public void Iclickexcutionapiuploadimageprofile() {
        uploadImageCover.hitEndpointSendInvoice();

    }
    @Then("Otp upload image cover")
    public void Otpuploadimageprofile() {

    }


}
