Feature: demoqa
Scenario: test allproducts page

Given the user is on homepage
When the user clicks on all products link
Then go to all products page
And Verify it is the correct page


#Using data-driven Examples keyword
Scenario Outline: Register users
Given the user is on register page
When the user enters "<username>" and "<email>"
Then new account should be created


Examples:
|username|email|
|Tejas|imtejaspatel@yahoo.com|
|Patel|thesoccerist10@gmail.com|

Scenario:
#Using data tables
Given user is on new contact page
When user enters his/her credentials
|Tejas|Patel|
|Pratikshep|Deshmukh|
Then user provides position
|QA|
|Developer|
Then close the browser