Feature: AsianpaintsDocumentDetails


Scenario: Access the document page
Given I am on the Asianpaints home page
And I am a loggedin user
When I click on profile active button
And I click on Myprofile button
And I click on Mydocuments button
Then I can see the documentDetails 