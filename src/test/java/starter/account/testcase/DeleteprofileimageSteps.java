package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.javaclass.DeleteProfileImage;

public class DeleteprofileimageSteps {
    @Steps
    DeleteProfileImage deleteProfileImage;

    @Given("I am delete image api profile")
    public void Iamuploadimageapiprofile() {
        deleteProfileImage.setBodyReq();

    }

    @When("I am login again for delete image profile")
    public void Iamloginagainforuploadimageprofile() {
       deleteProfileImage.hitEndpointLoginUser();
        deleteProfileImage.hitEndpointSendInvoice();

    }
    @When("I click excution api delete image profile")
    public void Iclickexcutionapiuploadimageprofile() {
        deleteProfileImage.hitEndpointDelete();

    }
    @Then("Otp delete image profile succefully")
    public void Otpuploadimageprofile() {



    }
}
