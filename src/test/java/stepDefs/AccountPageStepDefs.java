package stepDefs;

import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.AccountPage;

public class AccountPageStepDefs {

  private final AccountPage accountPage = new AccountPage();

  @Then("I check that {string} title appears on the left menu")
  public void checkTheTitleAppears(String expectedTitlePage) {
    String actualTitlePage = accountPage.getTittleAccountPage();
    Assertions.assertThat(actualTitlePage)
        .as("We are waiting title text on account page: [" + expectedTitlePage
            + "], and received text: [" + actualTitlePage + "]")
        .isEqualTo(expectedTitlePage);
  }
}
