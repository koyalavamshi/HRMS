package testRunner;

import org.junit.runner.RunWith;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/src/test/resource/feature"},
        glue = {"stepDefination", "AppHooks"},
        tags = "@Registration_Test",
        plugin = {"pretty",



        }



)
public class MyTestRunner {

}



