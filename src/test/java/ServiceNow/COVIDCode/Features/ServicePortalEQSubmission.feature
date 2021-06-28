Feature: Service Portal Enrollment Questionnaire Submissions

<<<<<<< Updated upstream
  @Smoke @juarezds @Progression
=======
<<<<<<< HEAD
  @Smoke @updatedJan282021 @juarezds
=======

  @Smoke @juarezds 
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: COVIDcode Study Provider Enrollment Questionnaire Submission Group 1 User
    Given a COVIDcode Study Provider user has logged in to the COVIDcode Study application
    When the COVIDcode Study Provider fills out an Enrollment Questionnaire for a "User Group 1" who says "Yes" to join the study
    And enters users full name, required information, and demographics information
    But does not enter Disease Course and Exposures and Risk Factors information
    And Submits the enrollment questionnaire
    Then the enrollment questionnaire should be successfully submitted

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @updatedFeb082021 @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: On the Enrollment Form, in the Exposures and Risk Factors tab, change the field options for following questions
    Given a user is on the Exposures and Risk Factors tab on  COVIDcode Enrollment Questionnaire
    Then the options for the following questions Non-steroidal anti-inflammatory drugs, Myocardial infarction or stroke medication, Paracetamol/acetaminophen, Blood thinners, Asthma medication, ACE-inhibitors for blood pressure, Pollen allergy medication, ARBs, Antibiotics penicillin, azithromycin are: -- None --, Day of or day before onset of symptoms/diagnosis (if asymptomatic), 2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic), 1 to 4 weeks prior to onset of symptoms/diagnosis (if asymptomatic), 1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic), Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic), Never, Don’t know, Prefer not to answer

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @updatedJan282021 @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Verifying Spelling in Confirmation Submission
    Given an enrollment form has been filled out
    When submitting
    Then a pop up with the message "Are you sure you want to submit this questionnaire? Please make sure you review each tab and double-check your input for accuracy." displays

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Verify Drug Treatments - Add Convalescent Plasma on Enrollment Questionnaire
    Given a COVIDCode App Admin user is in the Portal
    When the user creates a draft Enrollment questionnaire
    And creates a new Disease Course record
    Then there is a field option called "Convalescent plasma" for the Drug Treatments field

<<<<<<< Updated upstream
  @Smoke @COVID-425 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-425 @updatedFeb122021 @juarezds
=======
  @Smoke @COVID-425 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Initial Questionnaire Form - Verifying Error Message for Invalid Data in Inches
    When on the Initial Questionnaire form in Service Portal
    And on the Demographics Information section
    When selecting Feet/Inches for Height
    And entering any value for feet
    And entering a value greater than 12
    And clicking anywhere else or attempting to submit the application
    Then a message "Because you have a value in feet, inches cannot be more than 11.99" displays

<<<<<<< Updated upstream
  @Smoke @COVID-422 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-422 @juarezds
=======
  @Smoke @COVID-422 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Add Field Options for "When were you officially diagnosed with COVID-19" field
    When on the enrollment form in Service Portal
    And navigating to the Symptomology section
    Then "Have you officially been diagnosed with COVID-19?" question displays

<<<<<<< Updated upstream
  @Smoke @COVID-418 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-418 @juarezds
=======
  @Smoke @COVID-418 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Verifying Re-enable "Which Organs Showed Signs of Dysfunction/Failure?"
    Given a COVIDcode user is on the Initial Questionnaire form in Service Portal
    When on Disease Course section, when selecting "Yes" for the Organ Failure field
    Then a new question appears that reads "Which organ(s) showed signs of dysfunction/failure?"
    And the field options are: Liver, Kidney, Lungs, Heart, Central Nervous system, Hematologic System, Other, Other (free text field)

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario Outline: Fills out Service Portnal IQ Submissions
    Given a COVIDcode user has logged into the COVIDcode application in Service Portal
    And fills out patients contact information
    When the user enters "<biologicalSex>", "<describeYourRace>", "<areYouHispanicOrLatino>" information
    And selects Yes to being symptomatic
    And selects "<howWasTheSampleTaken>", "<whatTypeOfTestDidThePatientRecieve>"
    And in exposures and Risk Factors section enters "<pleaseTellMeIfThePatientHaveAnyOfTheFollowingMedicalConditions>", "<have the patient ever regularly vaped an e-cigarette or similar device>", "<have the patient smoked at least 100 cigarettes in your entire life>", "<non steroidal anti-inflammatory drugs>", "<paracetamol acetaminophen>", "<asthma medication>", "<pollen allergy medication>", "<antibiotics penicillin>", "<how many times have you been exposed to someone who tested positive for COVID 19>", "<myocardial infarction or stroke medication>", "<blood thinners>", "<ace inhibitors for blood pressure>", "<arbs>", "<did the patient wear a mask>"
    And selects Yes to having received the vaccine
    And enters vaccine information "<vaccine Manufacture>", "<have you received your second COVID 19 Vaccine>"
    And enters Disease Course information
    Then the user is able to successfully submit the Initial Questionnaire

    Examples: 
      | biologicalSex | describeYourRace                          | areYouHispanicOrLatino | howWasTheSampleTaken | whatTypeOfTestDidThePatientRecieve               | pleaseTellMeIfThePatientHaveAnyOfTheFollowingMedicalConditions | have the patient ever regularly vaped an e-cigarette or similar device | have the patient smoked at least 100 cigarettes in your entire life | non steroidal anti-inflammatory drugs                                 | paracetamol acetaminophen                                             | asthma medication                                                     | pollen allergy medication                                             | antibiotics penicillin                                                | how many times have you been exposed to someone who tested positive for COVID 19 | myocardial infarction or stroke medication                            | ace inhibitors for blood pressure                                     | arbs                                                                  | did the patient wear a mask | vaccine Manufacture | have you received your second COVID 19 Vaccine | blood thinners                                                        |
      | Male          | American Indian/Alaska Native             | No                     | Saliva               | Antibody testing                                 | Asthma                                                         | Currently use every day                                                | Never smoked                                                        | Day of or day before onset of symptoms/diagnosis (if asymptomatic)    | Day of or day before onset of symptoms/diagnosis (if asymptomatic)    | Day of or day before onset of symptoms/diagnosis (if asymptomatic)    | Day of or day before onset of symptoms/diagnosis (if asymptomatic)    | Day of or day before onset of symptoms/diagnosis (if asymptomatic)    | Never                                                                            | Day of or day before onset of symptoms/diagnosis (if asymptomatic)    | Day of or day before onset of symptoms/diagnosis (if asymptomatic)    | Day of or day before onset of symptoms/diagnosis (if asymptomatic)    | No                          | Pfizer              | Yes                                            | 2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic)    |
      | Female        | Asian                                     | Yes                    | Blood draw           | Antigen testing                                  | Atrial Fibrillation                                            | Currently uses some days of the month                                  | Smoked less than 100 cigarettes in lifetime                         | 2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic)    | 2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic)    | 2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic)    | 2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic)    | 2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic)    | Once                                                                             | 2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic)    | 2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic)    | 2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic)    | Yes                         | Moderna             | No                                             | 1 to 4 weeks prior to onset of symptoms/diagnosis (if asymptomatic)   |
      | Other         | Native Hawaiian or other Pacific Islander | Don't know             | Nasal or throat swab | Molecular (PCR) testing (several day turnaround) | Autoimmune disease                                             | Former user                                                            | Currently smokes daily                                              | 1 to 4 weeks prior to onset of symptoms/diagnosis (if asymptomatic)   | 1 to 4 weeks prior to onset of symptoms/diagnosis (if asymptomatic)   | 1 to 4 weeks prior to onset of symptoms/diagnosis (if asymptomatic)   | 1 to 4 weeks prior to onset of symptoms/diagnosis (if asymptomatic)   | 1 to 4 weeks prior to onset of symptoms/diagnosis (if asymptomatic)   | Multiple times                                                                   | 1 to 4 weeks prior to onset of symptoms/diagnosis (if asymptomatic)   | 1 to 4 weeks prior to onset of symptoms/diagnosis (if asymptomatic)   | 1 to 4 weeks prior to onset of symptoms/diagnosis (if asymptomatic)   | Don't know                  | Astra Zeneca        | No                                             | 1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic) |
      | Male          | Black or African American                 | Prefer not to answer   | Unsure/Don't know    | Rapid testing (up to 2 hour turnaround)          | Cerebrovascular Disease (stroke)                               | Never                                                                  | Currently smokes some days a month                                  | 1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic) | 1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic) | 1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic) | 1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic) | 1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic) | Don't know                                                                       | 1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic) | 1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic) | 1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic) | Yes                         | Don't Know          | No                                             | Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)    |
      | Male          | White                                     | Yes                    | Saliva               | Unsure/Don't know                                | Chronic liver disease                                          | Don't know/no answer                                                   | Stopped smoking in the last year                                    | Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)    | Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)    | Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)    | Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)    | Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)    | Once                                                                             | Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)    | Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)    | Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)    | Yes                         | Other               | No                                             | Never                                                                 |
      | Male          | More than one race                        | Yes                    | Saliva               | Antigen testing                                  | Chronic Renal Disease or Renal insufficiency                   | Currently use every day                                                | Stopped smoking 1-4 years ago                                       | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Once                                                                             | Never                                                                 | Never                                                                 | Never                                                                 | Yes                         | Pfizer              | No                                             | Don't know                                                            |
      | Male          | Don't know                                | Yes                    | Saliva               | Antigen testing                                  | COPD                                                           | Currently use every day                                                | Stopped smoking 5-9 years ago                                       | Don't know                                                            | Don't know                                                            | Don't know                                                            | Don't know                                                            | Don't know                                                            | Once                                                                             | Don't know                                                            | Don't know                                                            | Don't know                                                            | Yes                         | Pfizer              | No                                             | Prefer not to answer                                                  |
      | Male          | Prefer not to answer                      | Yes                    | Saliva               | Antigen testing                                  | Coronary Heart Disease                                         | Currently use every day                                                | Stopped smoking 10 or more years ago                                | Prefer not to answer                                                  | Prefer not to answer                                                  | Prefer not to answer                                                  | Prefer not to answer                                                  | Prefer not to answer                                                  | Once                                                                             | Prefer not to answer                                                  | Prefer not to answer                                                  | Prefer not to answer                                                  | Yes                         | Pfizer              | No                                             | Never                                                                 |
      | Male          | American Indian/Alaska Native             | Yes                    | Saliva               | Antigen testing                                  | Dementia                                                       | Currently use every day                                                | Don't know/prefer not to answer                                     | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Once                                                                             | Never                                                                 | Never                                                                 | Never                                                                 | Yes                         | Pfizer              | No                                             | Never                                                                 |
      | Male          | American Indian/Alaska Native             | Yes                    | Saliva               | Antigen testing                                  | Diabetes Mellitus                                              | Currently use every day                                                | Never smoked                                                        | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Once                                                                             | Never                                                                 | Never                                                                 | Never                                                                 | Yes                         | Pfizer              | No                                             | Never                                                                 |
      | Male          | American Indian/Alaska Native             | Yes                    | Saliva               | Antigen testing                                  | Don't know                                                     | Currently use every day                                                | Never smoked                                                        | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Once                                                                             | Never                                                                 | Never                                                                 | Never                                                                 | Yes                         | Pfizer              | No                                             | Never                                                                 |
      | Male          | American Indian/Alaska Native             | Yes                    | Saliva               | Antigen testing                                  | Hypertension                                                   | Currently use every day                                                | Never smoked                                                        | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Once                                                                             | Never                                                                 | Never                                                                 | Never                                                                 | Yes                         | Pfizer              | No                                             | Never                                                                 |
      | Male          | American Indian/Alaska Native             | Yes                    | Saliva               | Antigen testing                                  | Malignant Tumor (Cancer)                                       | Currently use every day                                                | Never smoked                                                        | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Once                                                                             | Never                                                                 | Never                                                                 | Never                                                                 | Yes                         | Pfizer              | No                                             | Never                                                                 |
      | Male          | American Indian/Alaska Native             | Yes                    | Saliva               | Antigen testing                                  | None of the above                                              | Currently use every day                                                | Never smoked                                                        | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Once                                                                             | Never                                                                 | Never                                                                 | Never                                                                 | Yes                         | Pfizer              | No                                             | Never                                                                 |
      | Male          | American Indian/Alaska Native             | Yes                    | Saliva               | Antigen testing                                  | Thyroid disease                                                | Currently use every day                                                | Never smoked                                                        | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Never                                                                 | Once                                                                             | Never                                                                 | Never                                                                 | Never                                                                 | Yes                         | Pfizer              | No                                             | Never                                                                 |

<<<<<<< Updated upstream
  @Smoke @COVID-406 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-406 @juarezds
=======
  @Smoke @COVID-406 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: COVIDcode Initial Questionnaire - Verify Study Staff Nurse is able to edit the NIH Medical Record field in Native View Enrollment Questionnaire
    Given a COVIDcode user has submitted an Initial Questionnaire with an NIH Medical Record number
    When a Study Staff Nurse navigates to native view to view the submitted enrollment and verify NIH Medical Record number
    Then the Study Staff Nurse is able to edit NIH Medical Record field

<<<<<<< Updated upstream
  @Smoke @COVID-259 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-259 @juarezds
=======
  @Smoke @COVID-259 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: COVIDcode Initial Questionnaire - Verifying updated Hospital Name
    Given a COVIDcode user is on the Service Portal Initial Questionnaire form
    Then the user is able to see the "Hospital Name" field in Service Portal

<<<<<<< Updated upstream
  @Smoke @COVID-196 @juarezds
  Scenario: COVIDcode Initial Questionnaire - Verifying the system does not allow any future dates to be selected for any date picker
    Given a COVIDCode user is on the Initial questionnaire page
    Then the system does not allow any future dates to be selected for any date picker
=======
<<<<<<< HEAD
  @Smoke @New @COVID-196 @juarezds
  Scenario: COVIDcode Initial Questionnaire - Verifying the system does not allow any future dates to be selected for any date picker
    Given a COVIDCode user is on the Initial questionnaire page
    Then the system does not allow any future dates to be selected for any date picker
=======
  @Smoke @COVID-196 @juarezds
  Scenario: COVIDcode Initial Questionnaire - Verifying the system does not allow any future dates to be selected for any date picker
    Given a COVIDCode user is on the Initial questionnaire page
    Then the system does not allow any future dates to be selected for any date picker
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
