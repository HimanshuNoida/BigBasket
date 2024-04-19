@ShopByCategory
Feature: In order to check
         As a user when user clicked on any 
         category then particular category 
         should display

  Scenario: To check for all category should display when user clicks them
    Given user was already login and is on the HomePage of the website
    When user clicks the shop by category button
    And selects any category like below
      | Fruits & Vegetables | Bakery, Cakes & Dairy | Beverages | Snacks & Branded Foods | Beauty & Hygiene |
  
    Then particular categoryName should come in the  title bar
