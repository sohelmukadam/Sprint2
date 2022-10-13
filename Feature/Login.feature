Feature: AsianpaintsLogin

Scenario: Login successful
Given I am on the Asianpaints home page
And I click on profile button
When I enter number as "9987050342"
And I enter otp
And I click on submit button
Then login is successful


