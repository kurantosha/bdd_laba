Feature: WishList page on site

  Scenario: Check the addition of products to the WishList page
    Given I am on the main page of the site
    When I click on My Account button
    And I go to Login page
    And I enter email as testing12309862@test.com and password as 111002299338844
    And I click on login button
    And I select Components -> Monitors in the top menu
    And I click Add to Wish List button for 'Apple Cinema 30"'
    And I click Add to Wish List button for 'Samsung SyncMaster 941BW'
    And I click on My wish list button on the top of the page
    Then I check that 2 items exist in your wish list
    And I check that added 'Apple Cinema 30"' to the wishlist
    And I check that added 'Samsung SyncMaster 941BW' to the wishlist