
Feature: in order to validate user deatils account
      In order  to check  the user details 
      As a user 
      clicks on the userDeatil icon

@UserDetails
  Scenario Outline: To validate user account details
    Given User is on the Home Page of the Website "https://www.bigbasket.com/"
    When user click on the  user detail icon
    Then is able to see all the "<userdetails>" options

    Examples: 
      | userdetails     |
      | My Basket       |
      | My Smart Basket |
      | My Wallet       |
      | Contact Us      |