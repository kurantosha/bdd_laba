Feature: Login on site

  Scenario: Login to site with valid credentials
    Given I am on the main page of the site
    When I click on My Account button
    And I go to Login page
    And I enter email as testing12309862@test.com and password as 111002299338844
    And I click on login button
    Then I check that 'My Account' title appears on the left menu