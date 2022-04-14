package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/main/resources/features/registerFeature/register.feature",
    glue = {"hooks", "stepDefs"}
)
public class RegisterRunner extends AbstractTestNGCucumberTests {

}
