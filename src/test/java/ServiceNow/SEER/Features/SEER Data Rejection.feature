Feature: This feature file contains SEER Data Requests Rejection Scenarios

  @ODS-320 @juarezds @Progression
  Scenario: Test Update rejection notification for institutional users
    Given a user is on the SEER Data Access landing page
    And proceeds to register for research data with unique email address
    And fills out all required fields on SEER Data registration page
