package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/main/resources/features.productFeatures/wishList.feature",
    glue = {"hooks", "stepDefs"}
)
public class AddToWishListRunner extends AbstractTestNGCucumberTests {

}
