package stepDefination;

import com.pages.LoginPage;
import com.qa.Factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
    private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());


    @Given("enter url")
    public void enter_url() {
        loginpage.enterUrl("https://adactinhotelapp.com/index.php");
    }



    @Given("enter the user_name {string}")
    public void enter_the_user_name(String user_name) {

        loginpage.enter_username(user_name);
    }

    @When("enter the pass_word {string}")
    public void enter_the_pass_word(String pass_word) {
        loginpage.enter_pass(pass_word);
    }

    @And("click on login btn")
    public void click_on_login_btn() {
        loginpage.clickOnLoginBtn();
    }

    @And("display the title of the home page")
    public void display_the_title_of_the_home_page() {
        loginpage.displayTitleOfPage();

    }

    @Then("click on logout")
    public void click_on_logout() {
        loginpage.clickOnLogout();
    }


}
