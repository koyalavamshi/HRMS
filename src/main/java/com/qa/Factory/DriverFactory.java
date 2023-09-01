package com.qa.Factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public WebDriver driver;  //access by driverfactory

    public static ThreadLocal<WebDriver>tlDriver = new ThreadLocal<>();
   /*parallel mode(execution)
    //This method is used to initialize the threadlocal driver on the basis of given browser
    @param browser
    @return
    */
    public WebDriver init_driver(String browser) {

        System.out.println("browser value is : " + browser);

        if(browser.equals("chrome")) {

            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
            //Thread gives set and get methods..here chromedriver of chromedriver created it will set up with Threadlocal driver

        }
        else if(browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());
        }
        else {
            System.out.println("Please pass the correct browser value: " + browser);
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();

    }
    /*
    *this is used to get the driver with threadlocal
    * return
     */
    public static synchronized  WebDriver getDriver() {
        return tlDriver.get();
    }
}

