Feature: Using map

Scenario:
#Data-driven using map
Given user is on new contact page
When user enters his/her credentials
|firstname|lastname|
|Tejas|Patel|
|Pratikshep|Deshmukh|
Then user provides position
|position|salary|
|QA|less|
|Developer|more|
Then close the browser