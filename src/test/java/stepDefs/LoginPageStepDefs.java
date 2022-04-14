package stepDefs;

import io.cucumber.java.en.When;
import pages.LoginAccountPage;

public class LoginPageStepDefs {

  private final LoginAccountPage loginAccountPage = new LoginAccountPage();

  @When("I enter email as {word} and password as {word}")
  public void enterEmailAndPassword(String email, String password) {
    loginAccountPage.loginOnSite("testing12309862@test.com", "111002299338844");
  }

  @When("I click on login button")
  public void clickOnLoginButton() {
    loginAccountPage.clickOnLoginButton();
  }
}