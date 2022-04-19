Feature: Register to site

  Scenario: Register to site with valid credentials
    Given I am on the main page of the site
    When I click on My Account button
    And I go to Register page
    And I fill the First Name field with valid credentials
    And I fill the Last Name field with valid credentials
    And I fill the E-Mail field with valid credentials
    And I fill the Telephone field with valid credentials
    And I fill the Password field with valid credentials
    And I fill the Password Confirm field with valid credentials
    And I click on checkbox I have read and agree to the Privacy Policy
    And I click on Continue button
    Then I check the message 'Your account has been created!' appears

  Scenario: Register to site with valid credentials, except 'First Name'
    Given I am on the main page of the site
    When I click on My Account button
    And I go to Register page
    And I fill the Last Name field with valid credentials
    And I fill the E-Mail field with valid credentials
    And I fill the Telephone field with valid credentials
    And I fill the Password field with valid credentials
    And I fill the Password Confirm field with valid credentials
    And I click on checkbox I have read and agree to the Privacy Policy
    And I click on Continue button
    Then I check that message 'First Name must be between 1 and 32 characters!' appears