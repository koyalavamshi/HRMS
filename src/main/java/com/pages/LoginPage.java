package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

   private WebDriver driver;
    private By UN = By.id("username");
    private By PW = By.id("password");
    private By Login_btn = By.id("login");
    private By Logout = By.linkText("Logout");




    public LoginPage (WebDriver driver){
        this.driver = driver;

    }
    public void enterUrl(String url){
       driver.get(url);
    }

    public void enter_username (String user_name){
        driver.findElement(UN).sendKeys(user_name);

    }
    public void enter_pass(String pass_word){
        driver.findElement(PW).sendKeys(pass_word);
    }
    public void clickOnLoginBtn(){
        driver.findElement(Login_btn).click();
    }
    public void displayTitleOfPage(){
        driver.getTitle();


    }
    public void clickOnLogout(){
        driver.findElement(Logout).click();
    }
}
