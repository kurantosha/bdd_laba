package stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import pages.RegisterAccountPage;

public class RegisterPageStepDefs {

  protected Faker faker = new Faker();
  private String password = faker.internet().password();
  private final RegisterAccountPage registerAccountPage = new RegisterAccountPage();

  @When("I fill the First Name field with valid credentials")
  public void enterFistNameField() {
    registerAccountPage.enteredFirstNameAs(faker.name().firstName());
  }

  @When("I fill the Last Name field with valid credentials")
  public void enterLastNameField() {
    registerAccountPage.enteredLastNameAs(faker.name().lastName());
  }

  @When("I fill the E-Mail field with valid credentials")
  public void enterEmailField() {
    registerAccountPage.enteredEmailAs(faker.internet().emailAddress());
  }

  @When("I fill the Telephone field with valid credentials")
  public void enterPhoneField() {
    registerAccountPage.enteredPhoneAs(faker.phoneNumber().cellPhone());
  }

  @When("I fill the Password field with valid credentials")
  public void enterPasswordField() {
    registerAccountPage.enteredPasswordAs(password);
  }

  @When("I fill the Password Confirm field with valid credentials")
  public void EnterPasswordConfirmField() {
    registerAccountPage.enteredPasswordConfirmAs(password);
  }

  @When("I click on checkbox I have read and agree to the Privacy Policy")
  public void clickOnCheckboxPrivacyPolicy() {
    registerAccountPage.clickPolicyCheckbox();
  }

  @When("I click on Continue button")
  public void clickOnContinueButton() {
    registerAccountPage.clickRegistrationAccountButton();
  }

  @Then("I check that message {string} appears")
  public void checkErrorMessageRegisterAppears(String expectedErrorMessage) {
    String actualErrorMessage = registerAccountPage.clickRegistrationAccountButton(
        expectedErrorMessage);

    Assertions.assertThat(actualErrorMessage)
        .as("We are waiting error message: [" + expectedErrorMessage + "], and received text: ["
            + actualErrorMessage + "]")
        .isEqualTo(expectedErrorMessage);
  }

}