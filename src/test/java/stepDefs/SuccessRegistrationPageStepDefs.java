package stepDefs;

import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.SuccessRegistrationPage;

public class SuccessRegistrationPageStepDefs {

  private final SuccessRegistrationPage successRegistrationPage = new SuccessRegistrationPage();

  @Then("I check the message {string} appears")
  public void checkTheMessageYourAccount(String expectedResultText) {
    String actualResultText = successRegistrationPage.getTextAccountHasBeenCreated();

    Assertions.assertThat(actualResultText)
        .as("We are waiting for the text: [" + expectedResultText + "], and received text: ["
            + actualResultText + "]")
        .isEqualToIgnoringCase(expectedResultText);
  }
}