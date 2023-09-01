package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver=driver;
    }
    public void url1(String url){

        driver.get(url);
    }

    public String gethomepagetitle(){

        return driver.getTitle();
    }
    public boolean getlogdisplay(){
    return driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
    }
    public void clickonnewregistration(){
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[7]/td/a")).click();
    }


}
