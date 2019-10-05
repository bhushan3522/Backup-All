Feature: CRMPRO login feature

#Scenario: CRMPRO login test

#Given user has launched google chrome browser
#When user is already on login page
#Then user will enter "bhushan3522" and "tu3f1011032"
#Then user will click on login button
#Then user will be navigated to home page

Scenario Outline:

Given user has launched google chrome browser
When user is already on login page
Then user will enter "<username>" and "<password>"
Then user will click on login button
Then user will be navigated to home page

Examples:
|	username	|	password	|
|	abc			|	123			|
|	zxc			|	456			|