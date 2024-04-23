@SavedforLaterUse
Feature: To check for when the user  use any saved 
         for later item then that item should come under
        save  for later 
        

Scenario: To check for saved for later items

Given user was logged in and is on the category page 
When user scroll to "Pre Shave Foam - Classic Menthol" item 
And click on saved for later tag
Then the item should get marked for save for later 


Scenario: To check for when user marked a item then it should marked in saved for later

Given and user is on the saved for later page and user has already marked a item for save for later 
Then it should get display in saved for later page 
    



          
          
        