Feature: COVIDCode Service Portal Draft Follow-Up Questionnaires Scenarios
  
  Description: This feature file contains scenarios related to Service Portal Draft Follow-Up Questionnaires

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @updatedFeb082021 @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: A user in the CovidCode App Admins group is able to open a saved draft follow up questionnarie - Service Portal
    Given a user in the CovidCode App Admins group has saved a draft Follow-up Questionnaire
    When the user in the CovidCode App Admins group comes to the COVIDCode Home Page
    Then the draft is shown in the Draft Follow up Questionnaires table on the Home Page
    And the user can resume draft follow up questionnaire by clicking the Open button

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Follow Up Questionnaire add a field option Other,specify in Disease Course section under Symptoms
    Given a COVIDcode user is on the Disease Course section on the Follow Up form
    When select "Other, specify" for the Symptoms
    Then a free text field "Specify" text is displayed

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Verify Drug Treatments - Add Convalescent Plasma on Follow-up questionnaire
    Given COVIDCode App Admin user is in the Portal
    When the user creates a draft Follow-up questionnaire
    And create a new Disease Course record
    Then there is a field option called a "Convalescent plasma" for the Drug Treatments field

<<<<<<< HEAD
  @new @Smoke
=======
  
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
  Scenario: a Study Staff nurse can save the follow up form so that he/she may continue working on it at a later time.
    Given an enrollment form has been filled out

