Feature: Flipcart search feature

@search
Scenario: user want to search for a product online
Given user is on flipcart home page
When user enters valid product name
Then browser should display the products