Feature: Login Page
Scenario Outline: Validate login functionality
Given User is at login page
When User enter username "<username>"
And User enter password "<password>"
And User clicks on sign in button
Then User sucessfully login to homepage
Examples:
|username |password |
|ronsmith@gmail.com |Ronsmith12345 |
| pallavi@gmail.com | pallavi |