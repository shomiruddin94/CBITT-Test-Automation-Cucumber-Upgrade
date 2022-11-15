package ServiceNow.NERD.Steps;

import java.util.Set;

import ServiceNow.NERD.Pages.NERDKnowledgebasePage;
import ServiceNow.NERD.StepsImplementation.NERDApplicationStepsImplementation;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CRS_Reviewers_Steps extends PageInitializer {

        @Given("a CRS reviewer is logged into NERDs CRS Knowledge Management System")
        public void a_CRS_reviewer_is_logged_into_NERDs_CRS_Knowledge_Management_System() throws TestingException {
                nativeViewLoginImpl.sideDoorAccountLogin();
                nativeViewImpersonateUser.impersonateToCRSReviewer();
                NERDApplicationStepsImplementation.userIsOnSubmissionsPage("NERD");
        }

        @When("adding a new OM entry")
        public void adding_a_new_OM_entry() {
                NERDApplicationStepsImplementation.addingNewOM_Entry();
        }

        @Then("OM Content Type {string} displays")
        public void om_Content_Type_displays(String omContentType) {
                NERDApplicationStepsImplementation.verifyingOM_ContentType(omContentType);
        }

        @Then("the following check box options are also available, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
        public void the_following_check_box_options_are_also_available(String administrationTransitionMaterial,
                        String congressionalJustification, String hhsRequests, String antiHarrassmentCivilityMaterial,
                        String donnasBlog, String furloughPlanning, String equityAndInclusionProgram,
                        String covid19LeadershipMessages) {

                NERDApplicationStepsImplementation.verifyingOfOM_CheckBoxes(administrationTransitionMaterial,
                                congressionalJustification, hhsRequests, antiHarrassmentCivilityMaterial, donnasBlog,
                                furloughPlanning,
                                equityAndInclusionProgram, covid19LeadershipMessages);
        }

        @Then("when selecting Other {string}")
        public void when_selecting_Other(String otherOmContent) {
                NERDApplicationStepsImplementation.selectingOfOtherOM_Content(otherOmContent);
        }

        @Then("the If Other is selected above, please specify {string} field displays")
        public void the_If_Other_is_selected_above_please_specify_field_displays(
                        String omContentTypeOtherPleaseSpecify) {
                NERDApplicationStepsImplementation.pleaseSpecifyFieldIsDisplayed(omContentTypeOtherPleaseSpecify);
        }

        @Given("a CRS Reviewer is on the NERD Knowledge Base page")
        public void a_CRS_Reviewer_is_on_the_NERD_Knowledge_Base_page() throws TestingException {
                nerdLoginStepsImplementation.loginToNerd();
                nativeViewImpersonateUser.impersonateToCRSReviewer();
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                WebDriverUtils.webDriver.navigate().refresh();
                MiscUtils.sleep(5000);
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
                MiscUtils.sleep(8000);
                CucumberLogUtils.logScreenShot();
        }

        @Given("clicks the {string} filter")
        public void clicks_the_filter(String SpecialTopic) {
                Assert.assertTrue(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDD.getText()
                                                .contentEquals(SpecialTopic));

                JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDD);
                MiscUtils.sleep(5000);
                JavascriptUtils.scrollDown(2000);
                CucumberLogUtils.logScreenShot();
        }

        @Then("the field options are {string}, {string}, {string},{string},{string},{string},{string},{string},{string},{string}, {string}")
        public void the_field_options_are(String All, String BigdataDataSharing, String COVID19, String EarlyDetection,
                        String Metastatic, String MinorityhealthHealthdisparities, String Moonshot, String Pediatric,
                        String Rare,
                        String TrainingWorkforcedevelopment, String Womenshealth) {
                MiscUtils.sleep(1000);
                String[] expectedValues = { All, BigdataDataSharing, COVID19, EarlyDetection, Metastatic,
                                MinorityhealthHealthdisparities, Moonshot, Pediatric, Rare,
                                TrainingWorkforcedevelopment, Womenshealth };

                String[] actualValue = new String[expectedValues.length];

                for (int i = 0; i < actualValue.length; i++) {
                        actualValue[i] = nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDDvalues.get(i)
                                        .getText().trim()
                                        .split("\\(")[0].replaceAll("&nbsp;", "").trim();
                }

                for (int i = 0; i < actualValue.length; i++) {
                        System.out.println(expectedValues[i]);
                        System.out.println(actualValue[i]);
                        Assert.assertEquals(expectedValues[i], actualValue[i]);
                }
                MiscUtils.sleep(1000);
        }

        @Given("a CRS Reviewer {string} is on the NERD Home Page")
        public void a_CRS_Reviewer_is_on_the_NERD_Home_Page(String crsReviewer) throws TestingException {

                nativeViewLoginImpl.sideDoorAccountLogin();
                nativeViewImpersonateUser.impersonateToAnyCRSReviewer(crsReviewer);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                MiscUtils.sleep(1500);
                CucumberLogUtils.logScreenShot();
        }

        @Then("there are three knowledge bases called {string}, {string}, and {string}")
        public void there_are_three_knowledge_bases_called_and(String nerd, String rock, String moonshotEvaluation) {

                CommonUtils.assertEquals(nerd, nerdHomePage.nerdKnowledgeBaseText.getText());
                CommonUtils.assertEquals(rock, nerdHomePage.rockKnowledgeBaseText.getText());
                CommonUtils.assertEquals(moonshotEvaluation,
                                nerdHomePage.moonshotEvaluationKnowledgeBaseText.getText());
                CucumberLogUtils.logScreenShot();
        }

        @When("the user clicks the NERD Knowledge Base")
        public void the_user_clicks_the_NERD_Knowledge_Base() {
                nerdHomePage.nerdKnowledgeBaseText.click();
                MiscUtils.sleep(2000);
        }

        @Then("the user is redirected to the Knowledge Base view page")
        public void the_user_is_redirected_to_the_Knowledge_Base_view_page() {

                Assert.assertTrue(nerdKnowledgeBasePage.nerdKnowledgeBaseViewText.isDisplayed());
                MiscUtils.sleep(2000);
                CucumberLogUtils.logScreenShot();
        }

        @Then("there is a collapsed accordion with the header labeled {string}")
        public void there_is_a_collapsed_accordion_with_the_header_labeled(String topAccomplishmentsAccordionText) {

                boolean isTopAccomplishmentAccordionDisplayed = NERDKnowledgebasePage
                                .dynamicAccordion(topAccomplishmentsAccordionText).getText()
                                .contains(topAccomplishmentsAccordionText);

                Assert.assertTrue(isTopAccomplishmentAccordionDisplayed);

                CucumberLogUtils.logScreenShot();
        }

        @When("the user clicks the {string} accordion header")
        public void the_user_clicks_the_accordion_header(String topAccomplishmentsAccordion) {

                NERDKnowledgebasePage.dynamicXpathNERDKnowledgeBaseAccordion(topAccomplishmentsAccordion).click();

                CucumberLogUtils.logScreenShot();
        }

        @Then("the {string} accordion expands")
        public void the_accordion_expands(String itemsPerPageAccordionText) {

                CucumberLogUtils.logScreenShot();
                // JavascriptUtils.scrollIntoView(NERDKnowledgebasePage
                // .dynamicXpathNERDKnowledgeBaseAccordionItemsPerPageText(itemsPerPageAccordionText));

                boolean isTopAccomplishmentsAccordionItemPerPageDisplayed = NERDKnowledgebasePage
                                .dynamicXpathNERDKnowledgeBaseAccordionItemsPerPageText(itemsPerPageAccordionText)
                                .isDisplayed();

                CommonUtils.assertTrue(isTopAccomplishmentsAccordionItemPerPageDisplayed);

                CucumberLogUtils.logScreenShot();
        }

        @Then("a list of all published {string} records is visible")
        public void a_list_of_all_published_records_is_visible(String topAccomplishments) {

                boolean isListForPublishedTopAccomplishmentsDisplayed = NERDKnowledgebasePage
                                .dynamicXpathNERDKnowledgeBaseAccordionList(topAccomplishments).isDisplayed();

                CommonUtils.assertTrue(isListForPublishedTopAccomplishmentsDisplayed);
                CucumberLogUtils.logScreenShot();
        }

        @Given("a CRS Reviewer {string} is viewing the list of the published {string}")
        public void a_CRS_Reviewer_is_viewing_the_list_of_the_published(String crsReviewer,
                        String topAccomplishmentsAccordion) throws TestingException {
                nativeViewLoginImpl.sideDoorAccountLogin();
                nativeViewImpersonateUser.impersonateToAnyCRSReviewer(crsReviewer);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                MiscUtils.sleep(1500);
                CucumberLogUtils.logScreenShot();
                nerdHomePage.nerdKnowledgeBaseText.click();
                MiscUtils.sleep(2000);
                NERDKnowledgebasePage.dynamicXpathNERDKnowledgeBaseAccordion(topAccomplishmentsAccordion).click();
                CucumberLogUtils.logScreenShot();
        }

        @Then("there is a record called {string}")
        public void there_is_a_record_called(String publishedArticleTitle) {

                boolean isArticleDisplayed = NERDKnowledgebasePage
                                .dynamicXpathNERDKnowledgeBaseTopAccomplishmentPublishedArticle(publishedArticleTitle)
                                .getText()
                                .contentEquals(publishedArticleTitle);

                CommonUtils.assertTrue(isArticleDisplayed);
                CucumberLogUtils.logScreenShot();
        }

        @When("the user clicks the title of the record {string}")
        public void the_user_clicks_the_title_of_the_record(String titleOfPublishedArticle) {

                NERDKnowledgebasePage
                                .dynamicXpathNERDKnowledgeBaseTopAccomplishmentPublishedArticle(titleOfPublishedArticle)
                                .click();
        }

        @Then("the user is redirected to the Article View of the {string} record")
        public void the_user_is_redirected_to_the_Article_View_of_the_record(String titleOfPublishedArticle) {

                CommonUtils.swicthToAnotherWindow();
                boolean isPublishedArticleDisplayed = NERDKnowledgebasePage
                                .dynamicXpathNERDKnowledgeBasePublishedArticleTitle(titleOfPublishedArticle).getText()
                                .contentEquals(titleOfPublishedArticle);
                CommonUtils.assertTrue(isPublishedArticleDisplayed);
                CucumberLogUtils.logScreenShot();
        }

        @Then("the following fields and their associated data are visible for Top Accomplishments, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
        public void the_following_fields_and_their_associated_data_are_visible_for_Top_Accomplishments(String category,
                        String rank, String title, String doc, String description, String cancerSiteType,
                        String researchType,
                        String specialTopic, String references, String otherReferences, String collaborations,
                        String fiscalYear,
                        String pointOfContact,
                        String pointOfContactEmail, String crsContact, String author) {

                CucumberLogUtils.logScreenShot();
                boolean isCategoryDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsCategoryText.getText()
                                .contentEquals(category);
                CommonUtils.assertTrue(isCategoryDisplayed);

                boolean isRankDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsRankText.getText()
                                .contentEquals(rank);
                CommonUtils.assertTrue(isRankDisplayed);

                boolean isTitleDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsTitleText.getText()
                                .contentEquals(title);
                CommonUtils.assertTrue(isTitleDisplayed);

                boolean isDOCDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsDOCText.getText()
                                .contentEquals(doc);
                CommonUtils.assertTrue(isDOCDisplayed);

                boolean isDescriptionDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsDescriptionText
                                .getText()
                                .contentEquals(description);
                CommonUtils.assertTrue(isDescriptionDisplayed);

                boolean isCancerSiteType = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsCancerSiteTypeText
                                .getText()
                                .contentEquals(cancerSiteType);
                CommonUtils.assertTrue(isCancerSiteType);

                boolean isResearchType = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsResearchTypeText.getText()
                                .contentEquals(researchType);
                CommonUtils.assertTrue(isResearchType);

                boolean isSpecialTopicDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsSpecialTopicText
                                .getText()
                                .contentEquals(specialTopic);
                CommonUtils.assertTrue(isSpecialTopicDisplayed);

                JavascriptUtils.scrollIntoView(nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsSpecialTopicText);

                CucumberLogUtils.logScreenShot();

                boolean isReferencesDislpayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsReferencesText
                                .getText()
                                .contentEquals(references);
                CommonUtils.assertTrue(isReferencesDislpayed);

                boolean isOtherReferencesDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsOtherReferencesText
                                .getText().contentEquals(otherReferences);
                CommonUtils.assertTrue(isOtherReferencesDisplayed);

                boolean isCollaborationsDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsCollaborationsText
                                .getText().contentEquals(collaborations);
                CommonUtils.assertTrue(isCollaborationsDisplayed);

                boolean isFiscalYearDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsFiscalYearText
                                .getText()
                                .contentEquals(fiscalYear);
                CommonUtils.assertTrue(isFiscalYearDisplayed);

                boolean isPointOfContactDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsPointOfContactText
                                .getText().contentEquals(pointOfContact);
                CommonUtils.assertTrue(isPointOfContactDisplayed);

                boolean isPointOfContactEmailDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsPointOfContactEmailText
                                .getText().contentEquals(pointOfContactEmail);
                CommonUtils.assertTrue(isPointOfContactEmailDisplayed);

                boolean isCRSContactDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsCRSContactText
                                .getText()
                                .contentEquals(crsContact);
                CommonUtils.assertTrue(isCRSContactDisplayed);

                boolean isAuthorDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsAuthorText.getText()
                                .contentEquals(author);
                CommonUtils.assertTrue(isAuthorDisplayed);
        }

}
