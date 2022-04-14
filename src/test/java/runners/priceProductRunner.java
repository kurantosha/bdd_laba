package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/main/resources/features.productFeatures/getPriceProduct.feature",
    glue = {"hooks", "stepDefs"}
)

public class priceProductRunner extends AbstractTestNGCucumberTests {

}
