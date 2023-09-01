package stepDefination;

import com.pages.HomePage;
import com.qa.Factory.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class HomepageSteps {

    private HomePage homepage = new HomePage(DriverFactory.getDriver());
    private static String title;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        DriverFactory.getDriver().get("https://adactinhotelapp.com/");
    }

    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {

        title = homepage.gethomepagetitle();
    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {

        homepage.getlogdisplay();
    }
    @Then("click on new registration page")
    public void click_on_new_registration_page() {
        homepage.clickonnewregistration();
    }

    @Then("close browser")
    public void close_browser() {
        DriverFactory.getDriver().quit();

    }

}