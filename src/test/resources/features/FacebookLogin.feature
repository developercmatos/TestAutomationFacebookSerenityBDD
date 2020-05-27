Feature: Do Login on Facebook application



  @FacebookLogin

  Scenario Outline: As a user, I would like to do login on facebook application
    Given I navigate to facebook login page
    When I do login using valid credentials login "<username>","<password>"
    And Click on the login button
    Then I must be able to view my session name in feed page "<session_name>"


    Examples:
    |               username                 |password   |session_name|
    |jidqccf_mcdonaldman_1590430631@tfbnw.net|f0rtagxbn53|  Madison   |

