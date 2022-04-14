package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/main/resources/features.loginFeatures/login.feature",
    glue = {"hooks", "stepDefs"}
)
public class LoginRunner extends AbstractTestNGCucumberTests {

}