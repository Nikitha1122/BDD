Feature: Github signup Feature
Using this feature user can create a new github account



Scenario: User want to signup with valid details
Given user is on GitHub page
When user enters valid details
Then browser must display 'Welcome to Github'


Scenario:  User want to signup with invalid details
Given user is on GitHub page
When user enters invalid username
Then browser should display 'Username  is already taken'


Scenario:  User want to signup with invalid details
Given user is on GitHub page
When user enters invalid password
Then browser should display 'password is short'

Scenario:  User want to signup with invalid details
Given user is on GitHub page
When user enters invalid EmailId
Then browser should display 'Email is invalid'

