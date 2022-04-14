package stepDefs;

import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.CamerasCardsPage;

public class CamerasCardsPageStepDefs {

  private final CamerasCardsPage camerasCardsPage = new CamerasCardsPage();


  @Then("I check that {int} cameras exist on page")
  public void checkCameras_exist_on_page(int expectedQuantityProductFromPage) {

    int actualQuantityProductFromPage = camerasCardsPage.getProductsFromCamerasCardPage().size();
    Assertions.assertThat(actualQuantityProductFromPage)
        .as("We are waiting quantity products: [" + expectedQuantityProductFromPage
            + "], and received: [" + actualQuantityProductFromPage + "]")
        .isEqualTo(expectedQuantityProductFromPage);
  }

  @Then("I check that {string} has old price {double}")
  public void checkOldPrice(String productName, Double expectedOldPrice) {
    double actualOldPriceProduct = camerasCardsPage.getOldPriceProduct(productName);

    Assertions.assertThat(actualOldPriceProduct)
        .as("We are waiting old product price: [" + expectedOldPrice + "], and received: ["
            + actualOldPriceProduct + "]")
        .isEqualTo(expectedOldPrice);
  }

  @Then("I check that {string} has new price {double}")
  public void checkNewPrice(String productName, Double expectedNewPrice) {
    double actualNewPriceProduct = camerasCardsPage.getNewPriceProduct(productName);

    Assertions.assertThat(actualNewPriceProduct)
        .as("We are waiting new product price: [" + expectedNewPrice + "], and received: ["
            + actualNewPriceProduct + "]")
        .isEqualTo(expectedNewPrice);
  }

  @Then("I check that {string} has ex.rate {double}")
  public void checkTaxRate(String productName, Double expectedTaxPrice) {
    double actualTaxPriceProduct = camerasCardsPage.getExPriceProduct(productName);

    Assertions.assertThat(actualTaxPriceProduct)
        .as("We are waiting Ex tax product price: [" + expectedTaxPrice + "], and received: ["
            + actualTaxPriceProduct + "]")
        .isEqualTo(expectedTaxPrice);
  }
}