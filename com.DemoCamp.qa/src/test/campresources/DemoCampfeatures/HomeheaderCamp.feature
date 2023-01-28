Feature: This is the DemoCamp Home header feature file


  @Homeheader
  Scenario: Verify Home link tab in the Homepage is available to access the Homepage
    Given Launch the application<"URL">
    When Click the Home link on the Home page
    Then Verify Home page is accessible to the user

  @Homeheader
  Scenario: Verify contact link tab in the Homepage is aviable to access Login page
    Given Launch the application<"URL">
    When User click the Contact link on the Home page
    Then Verify Contact page is accessible to the user

  @Homeheader
  Scenario: Verify About us link tab in the Homepage is aviable to access About us page
    Given Launch the application<"URL">
    When User click the About us link on the Home page
    Then Verify About us page is accessible to the user

  @Homeheader
  Scenario: Verify Cart link tab in the Homepage is aviable to access Cart page
    Given Launch the application<"URL">
    When User click on Cart link in Homepage
    Then Verify Cart page is accessible to the user

  @Homeheader
  Scenario: Verify Login link tab in the Homepage is aviable to access Login page
    Given Launch the application<"URL">
    When User click the Log in link on the Home page
    Then Verify Login page is accessible to the user

  @Homeheader
  Scenario: Verify Sign Up link tab in the Homepage is aviable to access Sign Up page
    Given Launch the application<"URL">
    When User click the Signup link on the Home page
    Then Verify Sign Up page is accessible to the user
