@Category
Feature: In order to check when user clicks any category then correct category title should come  in title bar 
 Scenario: To Verify the Product categories title  it should come according to catyegory selected

@Category
  Scenario Outline: What ever category we click it should open that category and tile of that should contain that  category
    Given user was already  login and on the HomaPage of the website "https://www.bigbasket.com/"
    When user clik these "<category>" as below
    Then particular category should get displayed in the title

    Examples: 
      | category                |
      | exotic-fruits-veggies/  |
     