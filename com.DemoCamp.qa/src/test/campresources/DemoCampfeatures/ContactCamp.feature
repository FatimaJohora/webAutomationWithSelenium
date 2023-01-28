Feature: This is DemoCamp Contact feature file

  @contact
  Scenario: Verify the Contract Name field on the Contract page
    Given Launch the application<"URL">
    When User click the Contact link on the Home page
    Then Verify the Contact name field on the  Contact page

  @contact
  Scenario: Verify User able to send messages after once click Send message button
    Given Launch the application<"URL">
    When User click the Contact link on the Home page
    When User enters the Contact email
    When User enters Contact name
    When User writes a messages
    When User click on Send message button
    Then Verifyu User able to send messages

  @contact
  Scenario: Verify user can not able to send messages without writing any messages
    Given Launch the application<"URL">
    When User click the Contact link on the Home page
    When User does not enter the Contact email
    When User  does not enter the Contact name
    When User does not write a messages
    When User click on Send message button
    Then Verify User does not able to send messages after once click Send message button
