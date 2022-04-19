Feature: get price product

  Scenario: get old, new, ex tsx prices from product
    Given I am on the main page of the site
    When I click on the Cameras from menu
    Then I check that 2 cameras exist on page
    And I check that 'Canon EOS 5D' has old price 122.00
    And I check that 'Canon EOS 5D' has new price 98.00
    And I check that 'Nikon D300' has ex.rate 80.00