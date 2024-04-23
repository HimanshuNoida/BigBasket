
@Invalid
Feature: In order to check a user should able to login into Milk Basket


@Invalid
  Scenario Outline: To check invalid login by user
    Given User is on the Home Page of the Website "https://www.bigbasket.com/"
    When user  enter the  "<MobileNumber>"
    And enter the "<OTP>"
    Then user not able to login into the website

    Examples: 
      | MobileNumber | OTP    |
      |   8920083168 | 123123 |



@Valid
  Scenario Outline: To check valid login by user
    Given User is on the Home Page of the Website "https://www.bigbasket.com/"
    When user  enter the  "<MobileNumber>"
    And enter the OTP
   Then user able to login into the website

    Examples: 
      | MobileNumber |
      |   8920083168 |
