Feature: Login page validation feature
@niki
Scenario: User want to login with valid details
Given User is on home page
When user enters valid username and password
Then browser should display 'Login success'

@niki
Scenario: User want to login with invalid details
Given User is on home page
When user enters invalid username and password
Then browser should display 'Login failure'

@niki
Scenario: user want to login with empty fields
Given User is on home page
When user click on login without username
Then browser should dispaly 'enter username' message

When user click on login without password
Then browser should dispaly 'enter password' message

