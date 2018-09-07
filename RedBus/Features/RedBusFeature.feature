Feature: RedBus search feature

@niki
Scenario: User want to search for particular bus
Given user is on redbus homepage
When user enters valid source and destination details
Then browser should display the buses