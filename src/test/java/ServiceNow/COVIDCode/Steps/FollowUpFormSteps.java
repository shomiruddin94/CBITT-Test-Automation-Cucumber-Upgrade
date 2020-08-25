package ServiceNow.COVIDCode.Steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FollowUpFormSteps extends PageInitializer {

	@When("a COVIDCode user accesses a Follow Up Form to update an existing enrollment")
	public void a_COVIDCode_user_accesses_a_Follow_Up_Form_to_update_an_existing_enrollment() throws TestingException {		
		followUpFormPageImpl.accessingFollowUpForm();
	}

	@Then("the question {string} should display in the demographics section")
	public void the_question_should_display_in_the_demographics_section(String questionText) {
		String txt = followUpFormPage.whatIsHighestEducationLevelCompleted.getText();
		Assert.assertTrue(txt.contentEquals(questionText));
		JavascriptUtils.scrollDown(2000);
		CucumberLogUtils.logScreenShot();		
	}
	
	@Given("a COVIDCode user is on the Follow Up Form to update an existing enrollment")
	public void a_COVIDCode_user_is_on_the_Follow_Up_Form_to_update_an_existing_enrollment() throws TestingException {	
		followUpFormPageImpl.accessingFollowUpForm();	
	}

	@Then("the user is able to search an existing enrollment by patient ID, last name, first name, or NIH Medical Record Number")
	public void the_user_is_able_to_search_an_existing_enrollment_by_patient_ID_last_name_first_name_or_NIH_Medical_Record_Number() {
		followUpFormPageImpl.searchEnrollmentByPatientIDLastNameFirstNameNIHMedicalRecordNumber();	
	}

	@Given("a COVIDCode Provider is on the Follow Up Form to update an existing enrollment")
	public void a_COVIDCode_Provider_is_on_the_Follow_Up_Form_to_update_an_existing_enrollment() throws TestingException {
		followUpFormPageImpl.accessingFollowUpForm();
	}

	@When("an enrollment is selected")
	public void an_enrollment_is_selected() {
		followUpFormPage.enrollmentSearchDropDown.click();
		followUpFormPage.enrollmentSearchTxtBox.sendKeys("AutomatedFN");	
		MiscUtils.sleep(3000);
		followUpFormPage.enrollmentSearchTxtBox.sendKeys(Keys.ENTER);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the Group ID and Hospital Code fields should be locked")
	public void the_Group_ID_and_Hospital_Code_fields_should_be_locked() {
		Assert.assertTrue(followUpFormPage.userGroupID.getAttribute("disabled").contentEquals("true"));
		Assert.assertTrue(followUpFormPage.hostHospitalCode.getAttribute("disabled").contentEquals("true"));
		CucumberLogUtils.logScreenShot();
	}
	
	@When("the user is on the Disease Course section to add information")
	public void the_user_is_on_the_Disease_Course_section_to_add_information() {		
		followUpFormPageImpl.accessingFollowUpFormDiseaseCourseSection();
	}

	@Then("the user is able to select multiple symptoms in the symptoms field")
	public void the_user_is_able_to_select_multiple_symptoms_in_the_symptoms_field() {
		followUpFormPage.diseaseCourseSymptomsField.click();
		followUpFormPage.diseasCourseSymptomsDDCoughOption.click();
		followUpFormPage.diseaseCourseSymptomsField.click();
		followUpFormPage.diseasCourseSymptomsDDFeverOption.click();
		CucumberLogUtils.logScreenShot();	
	}

	@When("the user selects {string} after having selected multiple symptoms")
	public void the_user_selects_after_having_selected_multiple_symptoms(String string) {
		followUpFormPage.diseaseCourseSymptomsField.click();
		followUpFormPage.diseasCourseSymptomsDDNoneOfTheAboveOption.click();
	}

	@Then("the user sees a pop up with the message {string}")
	public void the_user_sees_a_pop_up_with_the_message(String noneOfTheAboveMessage) {
		Assert.assertTrue(followUpFormPage.diseaseCourseNoneOfTheAboveMessage.getText().contentEquals(noneOfTheAboveMessage));
		CucumberLogUtils.logScreenShot();
	}
	@When("the user selects Yes")
	public void the_user_selects_Yes() {
		followUpFormPage.diseaseCoursePopUpYesButton.click();
	}

	@Then("{string} option displays and replaces all previously selected symptoms")
	public void option_displays_and_replaces_all_previously_selected_symptoms(String noneOfTheAboveAfterSelecting) {
	followUpFormPage.diseaseCourseOptionDisplayeAfterSelecting.getText().contentEquals(noneOfTheAboveAfterSelecting);
	}
	
	@When("the user attempts to add a symptom such as {string} after selecting {string} option")
	public void the_user_attempts_to_add_a_symptom_such_as_after_selecting_option(String string, String string2) {
		MiscUtils.sleep(2000);
		followUpFormPage.diseaseCourseSymptomsField.click(); 
		followUpFormPage.diseasCourseSymptomsDDCoughOption.click();
	}

	@Then("the user sees another pop up with the message {string}")
	public void the_user_sees_another_pop_up_with_the_message(String message) {
		Assert.assertTrue(followUpFormPage.diseaseCourseNoneOfTheAboveMessage.getText().contentEquals(message));		
	}

	@Then("{string} symptom is displayed")
	public void symptom_is_displayed(String coughOptionAfterSelected) {
		MiscUtils.sleep(2000);
		Assert.assertTrue(followUpFormPage.diseaseCourseOptionDisplayeAfterSelecting.getText().contentEquals(coughOptionAfterSelected));
	}

	@When("selecting {string} after having selected a symptoms")
	public void selecting_after_having_selected_a_symptoms(String string) {
		MiscUtils.sleep(3000);
		followUpFormPage.diseaseCourseSymptomsField.click(); 
	    followUpFormPage.diseasCourseSymptomsDDdontKnowOption.click();
	}

	@Then("the user is able to see another pop up with the message {string}")
	public void the_user_is_able_to_see_another_pop_up_with_the_message(String message) {
		Assert.assertTrue(followUpFormPage.diseaseCourseNoneOfTheAboveMessage.getText().contentEquals(message));
	}

	@Then("{string} option displays")
	public void option_displays(String dontKnowDisplayed) {
		MiscUtils.sleep(2000);
		Assert.assertTrue(followUpFormPage.diseaseCourseOptionDisplayeAfterSelecting.getText().contentEquals(dontKnowDisplayed));
	}
	
	

}
