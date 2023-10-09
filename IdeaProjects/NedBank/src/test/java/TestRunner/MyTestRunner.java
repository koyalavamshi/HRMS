package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"C:\\Users\\LENOVO\\IdeaProjects\\NedBank\\src\\test\\java\\resource\\SingleUser.feature"},
        glue = {"pojo"},
        plugin = {"pretty",
                "json:target/jsonReports/Cucumber-report.json",
                "html:target/Cucumber-html-report"}





)
public class MyTestRunner {
}
