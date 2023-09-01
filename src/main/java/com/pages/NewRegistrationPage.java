package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewRegistrationPage {

    private WebDriver driver;
    //By locators
    private By user_name = By.id("username");
    private By pass_word = By.id("password");
    private By confirmpass = By.id("re_password");
    private By full_name = By.id("full_name");
    private By email = By.id("email_add");

   //constructor of the newregistrepage
    public NewRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    //page actions: beahvi  or of page actions in  form of methods
    public void enterusername(String username){
        driver.findElement(user_name).sendKeys(username);

    }
    public void enterpassword(String password){

        driver.findElement(pass_word).sendKeys(password);
    }
    public void conformpassword(String comform_password){
        driver.findElement(confirmpass).sendKeys(comform_password);
    }

    public void fullname(String fullname){
        driver.findElement(full_name).sendKeys(fullname);
    }
    public void email(String emailaddress){
        driver.findElement(email).sendKeys(emailaddress);
    }


}
