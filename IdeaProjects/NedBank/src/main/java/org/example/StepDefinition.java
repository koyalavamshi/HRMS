package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.openqa.selenium.remote.DesiredCapabilities.*;

public class StepDefinition {
        WebDriver driver;
    @Given("User can be able to Shop on the Menu bar")
    public void user_can_be_able_to_shop_on_the_menu_bar() {
        WebDriverManager.chromedriver().create();
        driver = new ChromeDriver();
        driver.get("http://eqaroloflow.co.za/wp/wp-login.php?redirect_to=http%3A%2F%2Feqaroloflow.co.za%2Fwp%2Fwp-admin%2F&reauth=1");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.id("user_login")).sendKeys("TestUser");
        driver.findElement(By.id("user_pass")).sendKeys("Tester5027#");
        driver.findElement(By.id("wp-submit")).click();
        driver.findElement(By.linkText("Shop")).click();
    }
    @When("Order a An Apple iPad 8th Gen WiFi Cellular 32GB")
    public void order_a_an_apple_i_pad_8th_gen_wi_fi_cellular_32gb() {
        driver.findElement(By.xpath("//a[@aria-label='Visit product category Technology']//h2[@class='woocommerce-loop-category__title']")).click();

    }
    @When("Select Check out")
    public void select_check_out() {
        driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[1]/a[1]/h2")).click();

    }
    @When("Select Place your order")
    public void select_place_your_order() {
        driver.findElement(By.linkText("Add to cart")).click();

    }
    @Then("Print the order number")
    public void print_the_order_number() {
        driver.findElement(By.xpath("//*[@id=\"post-52\"]/div/div/div[2]/div/div/a")).click();




    }


}
