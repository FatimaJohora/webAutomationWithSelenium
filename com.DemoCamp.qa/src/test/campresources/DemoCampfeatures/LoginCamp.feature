Feature: This is DemoCamp Login feature file

  @Login
  Scenario: Verify the Login functionality with valid credentials successfully
    Given Launch the application<"URL">
    When User click the Log in link on the Home page
    And Enter a valid username
    And Enter a valid password
    And Click the Login button
    Then Verify user can log in successfully
    
   @Login
  Scenario: Verify the Login functionality with invalid credentials is not successful
    Given Launch the application<"URL">
    When User click the Log in link on the Home page
    And Enter an invalid username
    And Enter an invalid password
    And Click the Login button
    Then Verify user can not log in successfully
