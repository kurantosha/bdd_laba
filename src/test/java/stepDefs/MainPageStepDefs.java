package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageStepDefs {

  private final MainPage mainPage = new MainPage();

  @Given("I am on the main page of the site")
  public void openMainPage() {
    mainPage.openMainPage();
  }

  @When("I click on My Account button")
  public void clickOnMyAccountButton() {
    mainPage.clickOnMyAccountButton();
  }

  @When("I go to Register page")
  public void goToRegisterPage() {
    mainPage.clickOnRegisterButton();
  }

  @When("I go to Login page")
  public void goToLoginPage() {
    mainPage.clickOnLoginButton();
  }

  @When("I select Components -> Monitors in the top menu")
  public void clickOnMonitorsButton() {
    mainPage.getMainMenuBlock().hoverMouseOverComponentsTopMenuButton();
  }

  @When("I click on the Cameras from menu")
  public void clickOnCamerasMainMenuButton() {
    mainPage.getMainMenuBlock().clickOnCamerasTopMenuButton();
  }
}