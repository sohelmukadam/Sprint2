Feature: AsianpaintsProfileDetails


Scenario: Access the profile page
Given I am on the Asianpaints home page
And I am a loggedin user
When I click on profile active button
And I click on Myprofile button
Then I can see the profileDetails