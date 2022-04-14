package hooks;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

public class TestHooks {

  @Before
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    BasePage.setDriver(driver);
    BasePage.getDriver().manage().window().maximize();
  }



  @After
  public void closeDriver() {
    BasePage.getDriver().quit();
  }

}
