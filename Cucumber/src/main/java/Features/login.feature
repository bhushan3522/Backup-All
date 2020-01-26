Feature: CRMPRO login feature

Scenario Outline: CRMPRO invalid login test

Given user has launched google chrome browser
When user is already on login page
Then user will enter "<username>" and "<password>" and hit enter button

Examples:
	|	username	|	password	|
	|	abc			|	123			|
	|	dfg			|	456			|
	|	hij			|	789			|


Scenario: CRMPRO valid login test

Given user has launched google chrome browser
When user is already on login page
Then user will enter "bhushan3522" and "tu3f1011032" and hit enter button
Then user will be navigated to home page
Then verify loggedin username
Then logout
Then close the browser