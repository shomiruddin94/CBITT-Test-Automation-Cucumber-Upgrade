package ServiceNow.SEER.StepsImplementation;

import ServiceNow.SEER.Constants.DUA_Constants;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import ServiceNow.SEER.Constants.Registration_Constants;
import appsCommon.PageInitializer;

public class SEERDataAccessRequestPageStepsImpl extends PageInitializer {
    public static String newEmail = "seer" + CommonUtils.email;

    public static void fillingOutRegistrationForm() {
        /* ENTERING FIRST NAME */
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationFirstNameField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationFirstNameField,
                Registration_Constants.FIRST_NAME);

        /* ENTERING LAST NAME */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationLastNameField,
                Registration_Constants.LAST_NAME);

        /**
         * VERIFYING EMAIL ADDRESS AND THAT EMAIL ADDRESS FIELD IS READ-ONLY
         */
        Assert.assertEquals(newEmail,
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
        Assert.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
        MiscUtils.sleep(1000);

        /* CLICKING ON ORGANIZATION DROP DOWN */
        CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationOrganizationField);

        /* ENTERING ORGANIZATION NAME */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationOrganizationField,
                Registration_Constants.ORGANIZATION_NAME);
        MiscUtils.sleep(1000);

        /* ENTERING COUNTRY NAME */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCountryField,
                Registration_Constants.COUNTRY_NAME);

        /* SELECTING COUNTRY OPTION */
        CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationCountryUSA);
        MiscUtils.sleep(1000);

        /* ENTERING STREET ADDRESS */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationAddressField,
                Registration_Constants.STREET_ADDRESS);

        /* ENTERING CITY NAME */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCityField, Registration_Constants.CITY_NAME);

        /* ENTERING STATE */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationStateField, Registration_Constants.STATE);

        /* ENTERING ZIP CODE */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationZipcodeField,
                Registration_Constants.ZIP_CODE);
        MiscUtils.sleep(1000);

        /* ENTERING PHONE NUMBER */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationPhoneField,
                Registration_Constants.PHONE_NUMBER);

        /*
         * SELECTING VALUE FOR What best describes you for the purpose of requesting
         * this data?
         */
        CommonUtils.selectDropDownValue("General Public",
                seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
    }

    public static void fillingOutRegistrationFormWithoutStateAndZip() {
        /* ENTERING FIRST NAME */

        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationFirstNameField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationFirstNameField,
                Registration_Constants.FIRST_NAME);

        /* ENTERING LAST NAME */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationLastNameField,
                Registration_Constants.LAST_NAME);

        /**
         * VERIFYING EMAIL ADDRESS AND THAT EMAIL ADDRESS FIELD IS READ-ONLY
         */
        Assert.assertEquals(newEmail,
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
        Assert.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
        MiscUtils.sleep(1000);

        /* CLICKING ON ORGANIZATION DROP DOWN */
        CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationOrganizationField);

        /* ENTERING ORGANIZATION NAME */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationOrganizationField,
                Registration_Constants.ORGANIZATION_NAME);
        MiscUtils.sleep(1000);

        /* ENTERING STREET ADDRESS */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationAddressField,
                Registration_Constants.STREET_ADDRESS);

        /* ENTERING CITY NAME */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCityField, Registration_Constants.CITY_NAME);


        /* ENTERING PHONE NUMBER */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationPhoneField,
                Registration_Constants.PHONE_NUMBER);

        /*
         * SELECTING VALUE FOR What best describes you for the purpose of requesting
         * this data?
         */
        CommonUtils.selectDropDownValue("General Public",
                seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
    }

    public static void verifyingAgreements() {
        String actualTreatmentDataLimitationsAgreementText = seerDataAccessRequestPage.seerDataAccessTreatmentDataLimitationsAgreement.getText();
        CommonUtils.assertEquals(actualTreatmentDataLimitationsAgreementText, DUA_Constants.SEER_ACKNOWLEDGMENT_OF_TREATMENT_DATA_LIMITATIONS);
        CucumberLogUtils.logScreenShot();

        CommonUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText);
        String actualDataUseAgreementCertificationText = seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText.getText();
        CommonUtils.assertEquals(actualDataUseAgreementCertificationText, DUA_Constants.DATA_USE_AGREEMENT_CERTIFICATION);
        CucumberLogUtils.logScreenShot();

        CommonUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
        String actualDataAccessBestPracticeAssuranceText = seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText.getText();
        CommonUtils.assertEquals(actualDataAccessBestPracticeAssuranceText, DUA_Constants.BEST_PRACTICE_ASSURANCE);
        CucumberLogUtils.logScreenShot();
    }

    public static void enterEmailAddress() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmail);
        CucumberLogUtils.logScreenShot();
        CommonUtils.click(seerLandingPage.registerForResearchDataButton);
        MiscUtils.sleep(2000);
    }

    public static void theFollowingBreadcrumbsAreDisplayed(String homeBreadcrumb, String dataAndSoftwareBreadcrumb,
                                                           String incidenceDatabaseBreadcrumb, String requestSeerIncidenceDataBreadcrumb,
                                                           String submissionConfirmationBreadcrumb) {
        org.junit.Assert.assertEquals(homeBreadcrumb, seerLandingPage.seerHomeBreadcrumb.getText());
        JavascriptUtils.drawBlueBorder(seerLandingPage.seerHomeBreadcrumb);
        org.junit.Assert.assertEquals(dataAndSoftwareBreadcrumb, seerLandingPage.seerDataAndSoftwareBreadcrumb.getText());
        JavascriptUtils.drawBlueBorder(seerLandingPage.seerDataAndSoftwareBreadcrumb);
        org.junit.Assert.assertEquals(incidenceDatabaseBreadcrumb, seerLandingPage.seerIncidenceDatabaseBreadcrumb.getText());
        JavascriptUtils.drawBlueBorder(seerLandingPage.seerIncidenceDatabaseBreadcrumb);
        org.junit.Assert.assertEquals(requestSeerIncidenceDataBreadcrumb,
                seerLandingPage.seerRequestSeerIncidenceDataBreadcrumb.getText());
        JavascriptUtils.drawBlueBorder(seerLandingPage.seerRequestSeerIncidenceDataBreadcrumb);
        org.junit.Assert.assertEquals(submissionConfirmationBreadcrumb,
                seerLandingPage.seerSubmissionConfirmationBreadcrumb.getText());
        JavascriptUtils.drawBlueBorder(seerLandingPage.seerSubmissionConfirmationBreadcrumb);
        CucumberLogUtils.logScreenShot();
    }

    public static void userIsDirectedToThePage(String seerRegistrationIsCompleteText) {
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader);
        org.junit.Assert.assertEquals(seerRegistrationIsCompleteText,
                seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader);
    }

    public static void aUserIsOnTheSEERDataAccessLandingPage() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
        CucumberLogUtils.logScreenShot();
    }

    public static void submitsTheRegistrationForm() {
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationSubmitButton);
        CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationSubmitButton);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
    }

    public static void enteringAndSelectingForCountryField(String USA) {
        seerUserRegistrationPage.seerUserRegistrationCountryField.click();
        seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys(USA);
        seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
    }

    public static void theUserIsNotAbleToSubmitTheRegistrationFormBecauseTheStateAndZipCodeFieldsAreRequired() {
        String seerRegistrationPage = WebDriverUtils.getWebDriver().getTitle();
        org.junit.Assert.assertTrue(seerRegistrationPage.contentEquals("SEER User Registration - ODS SEER Data Access Request"));
        org.junit.Assert.assertTrue("Verifying State field is required",
                seerUserRegistrationPage.seerUserRegistrationStateStarSign.isDisplayed());
        org.junit.Assert.assertTrue("Verifying Zip Code field is required",
                seerUserRegistrationPage.seerUserRegistrationZipcodeStarSign.isDisplayed());
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationStateStarSign);
        MiscUtils.sleep(2000);
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationZipcodeStarSign);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
    }

    public static void theUserLandsOnThePage(String registrationIsCompleteText) {
        MiscUtils.sleep(2000);
        String seerRegistrationIsCompletePage = WebDriverUtils.getWebDriver().getTitle();
        org.junit.Assert.assertEquals("SEER Data Confirmation - ODS SEER Data Access Request", seerRegistrationIsCompletePage);
        org.junit.Assert.assertEquals(registrationIsCompleteText,
                seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());
        CucumberLogUtils.logScreenShot();
    }

    public static void thePageHeaderDisplaysAs(String seerIncidenceDatabasDetailsText) {
        org.junit.Assert.assertEquals(seerIncidenceDatabasDetailsText,
                seerUserRegistrationPage.seerUserRegistrationIncidenceDatabaseDetailsLink.getText());
        CucumberLogUtils.logScreenShot();
    }

    public static void theFollowingTextAlsoDisplays(String registrationIsCompleteFullText) {
        System.out.println(seerUserRegistrationPage.seerUserRegistrationConfirmationText.getText());
        org.junit.Assert.assertEquals(registrationIsCompleteFullText,
                seerUserRegistrationPage.seerUserRegistrationConfirmationText.getText());
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationConfirmationText);
    }

    public static void theBackToSEERDatabaseDetailsButtonDisplays() {
        org.junit.Assert.assertEquals("← Back to SEER Database details",
                seerUserRegistrationPage.seerUserRegistrationBackToSeerDatabaseDetailsButton.getText());
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationBackToSeerDatabaseDetailsButton);
    }

    public static void theFollowingSEERInformationTextDisplaysOnTheBottomOfThePage(
            String seerIsSupportedByTheSurveillanceResearchProgramText) {
        org.junit.Assert.assertEquals(seerIsSupportedByTheSurveillanceResearchProgramText,
                seerUserRegistrationPage.seerUserRegistrationSeerIsSupportedByTheSurveillanceResearchProgramText
                        .getText());
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationSeerIsSupportedByTheSurveillanceResearchProgramText);
        CucumberLogUtils.logScreenShot();
    }
}
