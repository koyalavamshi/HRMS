package stepDefination;

import com.pages.NewRegistrationPage;
import com.qa.Factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewRegistrationPageSteps {


    private NewRegistrationPage newRegistrationPage = new NewRegistrationPage(DriverFactory.getDriver());

    @And("enter the username {string}")
    public void enter_the_username(String username) {
       newRegistrationPage.enterusername(username);
    }

    @And("enter the password {string}")
    public void enter_the_password(String password) {
        newRegistrationPage.enterpassword(password);
    }

    @And("enter comform_password {string}")
    public void enter_comform_password(String comform_password) {
        newRegistrationPage.conformpassword(comform_password);
    }

    @And("enter the fullname {string}")
    public void enter_the_full_name(String fullname) {
        newRegistrationPage.fullname(fullname);
    }

    @And("enter the emailaddress {string}")
    public void enter_the_email_address(String emailaddress) {
        newRegistrationPage.email(emailaddress);
    }

    @Then("close the browser")
    public void close_the_browser() {
        DriverFactory.getDriver().quit();

    }
}


