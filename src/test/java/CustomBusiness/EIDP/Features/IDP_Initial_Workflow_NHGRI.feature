@NHGRIALL
Feature: Regression testing

  @InitiatesIDPnhgri @Smoke @Regression @Zamant2 @Needs_review
  Scenario: IDP request creates and decline and approve
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User creates IDP NGHRI request
      | Search For                         | Classification Type | NHGRI Training Organization |
      | NHGRI (Fellows and Employees Only) | All                 | DIR                         |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Laric,Pnina    | Ferguson,Kimberly | Henke,Joseph      |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page NHGRI
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP NHGRI request
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP NHGRI request
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And Logged in user changes the user to trainee
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Henke,Joseph"
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User clicks on APPROVE AND SUBMIT button NHGRI
    And User clicks on Yes button
    And Logged in user changes the user to trainee
    And User clicks on VERIFY MEETING button
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on proceed button of the trainee specific IDP NHGRI request
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits and waits for home queue
    And Logged in user changes the user to "Ferguson,Kimberly"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs being LBO
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @InitiatesIDPnhgriWithUniversity @Zamant2 @Needs_review
  Scenario: IDP request creates and decline and approve
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User creates IDP NGHRI request with university details
      | Search For                         | Classification Type | NHGRI Training Organization | TrainingTitle          |
      | NHGRI (Fellows and Employees Only) | All                 | DIR                         | VF-VISITING FELLOWSHIP |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Laric,Pnina    | Ferguson,Kimberly | Henke,Joseph      |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page NHGRI
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP NHGRI request
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP NHGRI request
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And Logged in user changes the user to trainee
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Henke,Joseph"
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User clicks on APPROVE AND SUBMIT button NHGRI
    And User clicks on Yes button
    And Logged in user changes the user to trainee
    And User clicks on VERIFY MEETING button
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on proceed button of the trainee specific IDP NHGRI request
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits and waits for home queue
    And Logged in user changes the user to "Ferguson,Kimberly"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs being LBO
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @sendBackIDPnhgri @Regression @Zamant2 @Needs_review
  Scenario: Send back to primary mentor flow
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User creates IDP NGHRI request
      | Search For                         | Classification Type | NHGRI Training Organization |
      | NHGRI (Fellows and Employees Only) | All                 | DIR                         |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Laric,Pnina    | Ferguson,Kimberly | Henke,Joseph      |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page NHGRI
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP NHGRI request
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP NHGRI request
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And User will clickOn proceed button
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Henke,Joseph"
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User clicks on RETURN TO THE PRIMARY MENTOR button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on proceed button of the trainee specific IDP NHGRI request
    And User clicks on SEND BACK TO TRAINEE button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Henke,Joseph"
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User clicks on APPROVE AND SUBMIT button NHGRI
    And User clicks on Yes button
    And Logged in user changes the user to trainee
    And User clicks on VERIFY MEETING button
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on proceed button of the trainee specific IDP NHGRI request
    And User clicks on Verify meeting and accept IDP button
    And User enters meeting date and submits and waits for home queue
    And Logged in user changes the user to "Ferguson,Kimberly"
    And User will click on IDP Awaiting response button
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs being LBO
    And User clicks on APPROVE IDP button
    And User clicks on yes button on trainee page

  @ReviseExistingIDPnhgri @Regression @Zamant2 @Needs_review
  Scenario: Revise Existing IDP
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Completed"
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Primary Mentor Changed" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button

  @IDPOnHoldnghri @Regression @Zamant2 @Needs_review
  Scenario: IDP is placed on HOLD
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User creates IDP NGHRI request
      | Search For                         | Classification Type | NHGRI Training Organization |
      | NHGRI (Fellows and Employees Only) | All                 | DIR                         |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Laric,Pnina    | Ferguson,Kimberly | Henke,Joseph      |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page NHGRI
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP NHGRI request
    And User clicks on Decline IDP button
    And Logged in user changes the user to trainee
    And User will clickOn proceed button
    And User clicks on Send IDP to the Primary Mentor button
    And Logged in user changes the user to "Laric,Pnina"
    And User clicks on the trainee specific IDP NHGRI request
    And User validates fields in all the tabs and values and clicks on No Revision option
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on SEND IDP TO THE TRAINEE button
    And Logged in user changes the user to trainee
    And Trainee verifies IDP request status as "Under Trainee's Review"
    And Logged in user changes the user to trainee
    And User reviews comments and feedbacks in all the tabs
    And User clicks on SUBMIT button
    And Logged in user changes the user to "Henke,Joseph"
    And User clicks on the trainee specific IDP being co-primary mentor
    And User marks all the fields as reviewed in all the tabs
    And User clicks on REVIEW AND TAKE ACTION button
    And User clicks on REVIEWED button
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Co-Primary (and/or) Additional Mentor's Review"
    And User clicks on search button
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Routine 6 Month follow up" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button
    And Logged in user changes the user to trainee
    And User will click on General Information section
    And User selects primary mentor as exactly "Burgess,Shawn"
    And User will click on revew and take action button
    Then User verifies IDP will be placed on hold message

  @releaseOnHoldnhgri @Regression @Zamant2 @Needs_review
  Scenario: Release IDP placed on hold
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Under Primary Mentor's Review"

  @CancelIdpnhgri @Regression @Zamant2 @Needs_review
  Scenario: Cancel IDP
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Trainee's Review"
    And User clicks on search button
    And User click on "Cancel IDP" on the grid
    And User reads the trainee name from cancel idp confirmation window
    And User enters comments and clicks on yes button on cancel idp window
    And Logged in user changes the user to trainee
    Then Trainee verifies IDP request status as "Cancelled"

  @UndoCancelIdpnhgri @Regression @Zamant2 @Needs_review
  Scenario: Undo Cancel IDP
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Cancelled"
    And User clicks on search button
    And User click on "Undo Cancel IDP" on the grid
    And User reads the trainee name from undo cancel idp confirmation window
    And User enters comments and clicks on yes button on undo cancel idp window
    And Logged in user changes the user to trainee

  @AddAndDeleteTempDelegatenhgri @Regression @Zamant2 @Needs_review
  Scenario: Add/Delete Temporary Delegates
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Temporary"
    And User adds new delegate
      | Name           | Start Date | End Date   |
      | Craft,Kathleen | 10/29/2021 | 01/29/2022 |
    Then User checks "Kathleen Craft" is added as delegate
    When User deletes "Kathleen Craft" from delegators table
    Then User check delegate delete message

  @AddAndDeletePermanentDelegatenhgri @Regression @Zamant2 @Needs_review
  Scenario: Add/Delete Permanent Delegates
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name           |
      | Craft,Kathleen |
    Then User checks "Kathleen Craft" is added as delegate
    When User deletes "Kathleen Craft" from delegators table
    Then User check delegate delete message

  @DelegateInitiatesIDPnhgri @Regression @Zamant2 @Needs_review
  Scenario: TD Delegate initiates IDP
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name           |
      | Craft,Kathleen |
    Then User checks "Kathleen Craft" is added as delegate
    And User will click on Search tab
    And Logged in user changes the user to "Craft,Kathleen"
    And User will click on search in dashboard
    And User creates IDP NGHRI request
      | Search For                         | Classification Type | NHGRI Training Organization |
      | NHGRI (Fellows and Employees Only) | All                 | DIR                         |
    And Logged in user changes the user to trainee
    And User will clickOn start idp button
    And User fills mandatory fields in general information section
      | Primary Mentor | Lab Driector name | Co Primary Mentor |
      | Laric,Pnina    | Ferguson,Kimberly | Henke,Joseph      |
    And User fills mandatory fields in project deliverable page
    And User fills mandatory fields in career goals page NHGRI
    And User fills mandatory fields in aligning expecations page
    And User will click on revew and take action button
    And User clicks on Send IDP to the Primary Mentor button

  @ExistSurveynhgri @Regression @Zamant2 @Needs_review
  Scenario: TD/AO Initiates the Exit Survey for the Fellow/Employee
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Craft,Kathleen"
    And User will click on search in dashboard
    And User clicks on search button
    And User click on "Exist Survey" on the grid
    And User clicks on yes button of modal
    Then User will click on ok button

  @TDReleaseHoldnhgri @Regression @Zamant2 @Needs_review
  Scenario: TD Delegates Release IDP placed on HOLD
    When User will login to the application as "gugulothus2" user
    And Logged in user changes the user to "Plante,Faith"
    And User will click on manage delegate button in dashboard
    And User select delegation type as "Permanent"
    And User adds new delegate
      | Name        |
      | Hurle,Belen |
    Then User checks "Belen Hurle" is added as delegate
    And User clicks on Home button
    And Logged in user changes the user to "Hurle,Belen"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "Under Training Director's Review"
    And User clicks on search button
    And User click on "Revise Existing IDP" on the grid
    And User clicks on yes button in pop up
    And Select the reason as "Routine 6 Month follow up" checkbox
    And User clicks on save and send mail button
    Then User will click on ok button
    And Logged in user changes the user to trainee
    And User will click on General Information section
    And User selects primary mentor as exactly "Burgess,Shawn"
    And User will click on revew and take action button
    Then User verifies IDP will be placed on hold message
    And Logged in user changes the user to "Hurle,Belen"
    And User will click on search in dashboard
    And User selects "Current IDP Status" as "On Hold"
    And User clicks on search button
    And User click on "Release Hold" on the grid
    And User reads the primary mentor name from release hold confirmation window
    And User enters release hold comments and clicks on ok button