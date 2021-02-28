@Smoke
Feature: Complating Task1 which is click button like for the shared picture

  Scenario: User should be able to login
    Given Go to login page
    And Enter the valid user name, password
    And Click sign in button
    And Go to Dashboard
    And Click the Task


  Scenario Outline: User should be able to select "<one>" post
    Given click the "<one>" post
    Then User should login instagram valid username and password instagram page
    When Click like button
    Then heart turned liked
    And Close the page

    Examples:
      | one |
      | 0   |
      | 1   |
      | 2   |
      | 3   |
      | 4   |
      | 5   |
      | 6   |
      | 7   |


