

Feature: Edit details about you on Facebook application

@EditDetails
Scenario Outline: As a user, I would like to edit my details about you on facebook application


Given I navigate to facebook page
When I do login with valid credentials login "<username>","<password>"
And Click on the button
And I verify my session name "<session_name>"
And I navigate to details about you page
And Add details about you "<details>"
Then I must be able to view my information saved "<details>"


Examples:
|               username                 |password   |session_name|details             |
|jidqccf_mcdonaldman_1590430631@tfbnw.net|f0rtagxbn53|  Madison   |My name is Mad Robot|