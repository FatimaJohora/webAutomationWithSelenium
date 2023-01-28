Feature: This is the DemoCamp Aboutus feature file

  @Aboutus
  Scenario: Verify the Video should is playable
    Given Launch the application<"URL">
    When User click the About us link on the Home page
    Then Verify About us text will display on the About us page

  @Aboutus
  Scenario: Verify User able to close the page after once click the close button
    Given Launch the application<"URL">
    When User click the About us link on the Home page
    When User click the play icon of the video on the About us page
    And The user can pause the video anytime
    Then Verify User is able to close the page after once click the close button
