package stepDefs;

import io.cucumber.java.en.When;
import pages.MonitorsCardsPage;

public class MonitorsCardsStepDefs {

  private final MonitorsCardsPage monitorsCardsPage = new MonitorsCardsPage();

  @When("I click Add to Wish List button for {string}")
  public void clickAddToWishListButton(String productName) {
    monitorsCardsPage.clickOnAddToWishList(productName);
  }

  @When("I click on My wish list button on the top of the page")
  public void clickOnMyWishListButton() {
    monitorsCardsPage.getHeaderMenuBlock().clickOnWishListMenuButton();
  }

}
