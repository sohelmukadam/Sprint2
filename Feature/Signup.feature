Feature: AsianpaintsSignup


Scenario: Signup successful
Given I am on the Asianpaints home page
And I click on profile button
When I enter number as "9324267231"
And I click on regSubmit button
And I enter name as "Sohel Mukadam"
And I enter email as "mikeposner619@gmail.com"
And I enter otp
And I click on registerSubmit button
Then signup is successful


