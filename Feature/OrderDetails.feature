Feature: AsianpaintsOrderDetails


Scenario: Access the order page
Given I am on the Asianpaints home page
And I am a loggedin user
When I click on profile active button
And I click on Myprofile button
And I click on Myorder button
Then I can see the orderDetails 