package stepDefs;

import io.cucumber.java.en.When;
import pages.LoginAccountPage;

public class LoginPageStepDefs {

  private final LoginAccountPage loginAccountPage = new LoginAccountPage();

  @When("I enter email as {word} and password as {word}")
  public void enterEmailAndPassword(String email, String password) {
    loginAccountPage.loginOnSite(email, password);
  }

  @When("I click on login button")
  public void clickOnLoginButton() {
    loginAccountPage.clickOnLoginButton();
  }
}