package stepDefs;

import io.cucumber.java.en.Then;
import java.util.List;
import org.assertj.core.api.Assertions;
import pages.MyWishListPage;

public class MyWishListPageStepDefs {

  private final MyWishListPage myWishListPage = new MyWishListPage();
  private List<String> namesProductsToWishList = myWishListPage.getNamesFromWishList();

  @Then("I check that {int} items exist in your wish list")
  public void checkItemsExistInWishList(int expectedQuantityProductsFromWishList) {
    int actualQuantityProductsFromWishList = myWishListPage.getAllProductsFromWishList().size();

    Assertions.assertThat(actualQuantityProductsFromWishList)
        .as("We are waiting quantity products from Wish list: "
            + expectedQuantityProductsFromWishList)
        .isEqualTo(expectedQuantityProductsFromWishList);
  }

  @Then("I check that added {string} to the wishlist")
  public void checkAddedProductsToTheWishlistAsName(String productName) {
    List<String> namesProductsToWishList = myWishListPage.getNamesFromWishList();

    Assertions.assertThat(namesProductsToWishList)
        .as("We are waiting names products from Wish list: " + productName + " but received: "
            + namesProductsToWishList)
        .containsAnyOf(productName);
  }

}