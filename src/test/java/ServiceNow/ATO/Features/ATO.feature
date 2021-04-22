Feature: ATO testing

  @CreatePackage @Regression @Smoke
  Scenario: ATO validation of create new package
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "All" package
    Then User clicks on new button to add role
    And User selects the system as "BRB"
    And User selects the Application hosting solution as "NCI Cloud One"
    Then User clicks on the contacts tab
    And User selects the dates
    And User enters the note as "Test Automation"
    And User clicks on submit button

  @CancelPackage
  Scenario: ATO validation of Cancel package
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "In Progress" package
    Then User click on "first" package code
    And User clicks on cancel ato button

  @FIPS199
  Scenario: ATO validate FIPS199 form
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "In Progress" package
    Then User click on "first" package code
    And User click on "FIPS199" security form
    And User change the form status to "In progress"
    And User assigns the form to "Satya Gugulothu"
    Then User goto "Approval" tab
    And User fills the approval details
    And User clicks on update button
    And User click on "FIPS199" security form
    Then User clicks on new button to add role
    And User fills the Security Category Impact Level details
    Then User clicks on submit button

  @eAuthentication
  Scenario: ATO validate eAuthentication form
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "In Progress" package
    Then User click on "first" package code
    And User click on "eAuthentication" security form
    And User change the form status to "In progress"
    And User assigns the form to "Satya Gugulothu"
    Then User fills the eAuthentication Assessment Details
    Then User goto "Assurance Levels" tab
    #And User fills the Assurance Levels details
    Then User goto "Approval" tab
    And User fills the approval details
    And User clicks on update button

  @SystemSecurityPlan
  Scenario: ATO validate System Security Plan form
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "In Progress" package
    Then User click on "first" package code
    And User click on "System Security Plan" security form
    And User change the form status to "In progress"
    And User assigns the form to "Satya Gugulothu"
    Then User goto "Approval" tab
    And User fills the approval details
    And User clicks on update button
    And User click on "System Security Plan" security form
    #Then User fills the System Security Plan Controls
    And User fills the System Assets
    And User clicks on submit button
    And User fills the Ports Protocols and services
    And User clicks on submit button
    And User fills the System Interconnections
    And User clicks on submit button
    And User clicks on update button

  @IdentityAcceeManagement
  Scenario: ATO validate identity and access management form
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "In Progress" package
    Then User click on "first" package code
    When User click on "Identity and Access Management" security form
    And User clicks on "Shared Accounts" tab
    And User clicks on new button to add role
    And User enters rules and privileges
      | Role | Privilege         | Type     | Sensitivity Level | Authorized privileges | Functions Performed |
      | Test | No Logical Access | External | Limited           | Test                  | Test                |
    And User change the form status to "In progress"
    And User assigns the form to "Satya Gugulothu"
    And User fills shared accounts details
      | Uses Shared Accounts | Shared Accounts Procedures |
      | true                 | Shared test account        |
    And User clicks on "System Password Requirements" tab
    And User clicks on System Uses Password Authentication checkbox
    And User fills system password requirements details
      | Strength Description | Change Frequency Description | Forgotten Procedure | Caching Description | Credential Obscured Confirmation | Failed Login Attempts | Least Privilege | Inactive Timeout |
      | Strong               | 3 Months                     | Through OTP         | Caching             | Email                            |                     3 | test privilege  | Inactive timeout |
    And User clicks on "Account Lifecycle Policy and Procedures" tab
    And User fills Account Lifecycle Policy and Procedures
      | Device Identification Description | Identifier Management Process | Authenticator Management Process | Account Management Process | System Use of Notifications Description | Permitted Unauthenticated Actions | Public Content Management Description |
      | Test Device Identification        | Test Identifier management    | Test Authenticator Management    | Test Account Management    | Test System Use of notifications        | Test Permitted Unauthenticated    | Test Public Content Management        |
    And User clicks on "Approval" tab
    And User fills the approval details
    And User clicks on update button

  @AuditAndAccountability
  Scenario: Validate Audit and Accountability form of the package
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "In Progress" package
    Then User click on "first" package code
    When User click on "Audit and Accountability" security form
    And User clicks on "Additional Info" tab
    And User fills Additional Info data
    And User clicks on "Approval" tab
    And User fills the approval details
    And User clicks on update button

  @ConfigurationManagementPlan
  Scenario: Validate Configuration Management Plan form of the package
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "In Progress" package
    Then User click on "first" package code
    When User click on "Configuration Management Plan" security form
    And User change the form status to "In progress"
    And User assigns the form to "Satya Gugulothu"
    And User clicks on update button
    And User click on "Configuration Management Plan" security form
    And User clicks on "Configuration Items" tab
    And User adds new configuration item
    And User clicks on "System Contacts" tab
    And User adds new system contacts

  @ContingencyPlan
  Scenario: Validate Contingency Plan form of the package
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "In Progress" package
    Then User click on "first" package code
    When User click on "Contingency Plan" security form
    And User change the form status to "In progress"
    And User assigns the form to "Satya Gugulothu"
    And User clicks on "Line of Succession" tab
    And User fills line of succession form
    And User clicks on "Approval" tab
    And User fills the approval details
    And User clicks on update button

  @IncidentResponseContactList
  Scenario: Validate Contingency Plan form of the package
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "In Progress" package
    Then User click on "first" package code
    When User click on "Incident Response Contact List" security form
    And User change the form status to "In progress"
    And User assigns the form to "Satya Gugulothu"
    And User clicks on "Approval" tab
    And User fills the approval details
    And User clicks on update button
