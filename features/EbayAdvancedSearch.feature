Feature: Ebay Advanced Search page

  @Regression
  Scenario: Ebay logo on advanced search page
    Given I am on ebay advanced search page
    When I click on Ebay logo
    Then I navigate to ebay home page

  @Search
  Scenario: Advanced search item
    Given I am on ebay advanced search page
    When I search advanced item
      | keyword   | exclude     | min | max |
      | Iphone 12 | refurbished | 400 | 800 |
   # Then I navigate to ebay home page
