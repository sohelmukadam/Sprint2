Feature: AsianpaintsProfileDetailsEdit


@PositiveTest&NegativeTest
Scenario Outline: Access the profile page and edit details
Given I am on the Asianpaints home page
And I am a loggedin user
When I click on profile active button
And I click on Myprofile button
And I click on edit button
And I click and edit firstname as "<firstname>"
And I click and edit lastname as "<lastname>"
#And I click and select dob field
#And I click and edit email as "Sohelrio37@gmail.com"
And I click and edit mobile as "<mobile>"
And I click and select gender 
And I click on update button
Then I can see the profileDetails updated


Examples:
| firstname | lastname | mobile |
| Sohel | Mukadam | 9987050342 |
| Sohel23 | Mukadam23 | 99870503 |