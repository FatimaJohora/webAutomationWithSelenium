Feature: This is DemoCamp Sign up feature file

  @Signup
  Scenario: Verify Username field on Sign up page
    Given Launch the application<"URL">
    When User click the Signup link on the Home page
    Then Verify the Username field on the Sign-up page

  @Signup
  Scenario: Verify without a username and password user can not Sign-up
    Given Launch the application<"URL">
    When User click the Signup link on the Home page
    And Empty username field
    And Empty password field
    When User click on the Signup button
    Then Verify user can not Sign up

  @Signup
  Scenario: Verify after entering a username and password user can register successfully
    Given Launch the application<"URL">
    When User click the Signup link on the Home page
    And Enter a username in the username field
    And Enter a password in the password field
    When User click on the Signup button
    Then Verify user can  register successfully
