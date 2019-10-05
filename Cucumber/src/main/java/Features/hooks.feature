Feature: Hooks in Cucumber

Scenario: To test Working of Hooks

Given Enter
When Print
Then Exit

@First
Scenario: login

Given perform login
When on login page
Then do something
Then logout