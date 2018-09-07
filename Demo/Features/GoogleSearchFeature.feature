Feature: Google search feature
Using this feature user can search for various information

@login
Scenario: User want to search information about 'Agile methodology' by entering valid set of words

Given User is on Google home page

When user search for 'Agile Methodology'

Then all page links should be displayed for 'Agile Methodology'