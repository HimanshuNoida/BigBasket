
Feature: In order to search any category 
       As a user when user 
       search  any category 
       then it should get searched 
       
@SearchItem
Scenario: to search any category by user 

Given  A user is on the hompage of the Website https://www.bigbasket.com/
When user search "tea" in searh bar 
Then user is able to find the product in the list 



