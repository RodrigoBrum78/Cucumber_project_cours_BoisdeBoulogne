Feature: Ebay home page scenario

  @smoke
  Scenario: Advanced search
    Given I am on the Ebay home page
    When I click on advanced link
    Then I naviguate to the advanced search page

  @t1 @deletecookies
  Scenario: Search items count
    Given I am on the Ebay home page
    When I search for 'iphone 11'
    Then I validate at least 1000 search items present

  @t2 @deletecookies
  Scenario: Search items count2
    Given I am on the Ebay home page
    When I search for 'laptop'
    Then I validate at least 1000 search items present

  @t3 @deletecookies
  Scenario: Search items in category
    Given I am on the Ebay home page
    When I search for 'soap' in 'baby' category

  # Then I validate at least 1000 search items present
  @t4 @deletecookies
  Scenario: Search items in category1
    Given I am on the Ebay home page
    When I search for 'selenium' in 'books' category
   # Then I validate at least 1000 search items present
   
   ### DDT ###
  @t5 
  Scenario Outline: Home page links
    Given I am on the Ebay home page
    When I click on '<link>'
    Then I validate that page navigates to '<url>' and title contains '<title>'
    Examples:
		|link|url|title|
		|Fashion|https://www.ebay.ca/b/Fashion/bn_7000259856|Fashion|
		|Electronics|https://www.ebay.ca/b/Electronics/bn_7000259124|Electronics|
		|Toys & Hobbies|https://www.ebay.ca/b/Toys-Hobbies/220/bn_1865497|Toys|
		
