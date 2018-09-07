Feature: Naukri Registration feature
Scenario: user want to signup with 'Naukri.com'
Given user is on the home page of 'Naukri.com'
When user click on 'Register with us'button
Then brewser should display next page

When User clicks on 'I am a fresher' button
Then browser should display registration page of account

When User enter valid details
Then  browser should display the next page

When user enters valid educational details
Then browser should display the next page

