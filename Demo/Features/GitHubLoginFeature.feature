Feature: Github login feature
Using this feature user can login into github account


Scenario: User want to login github using valid information

Given User is on GitHub account
When User enters valid username and password
Then browser will display login success


Scenario: User want to login github using invalid information

Given User is on GitHub account
When User enters invalid username and password
Then browser will display login failure
