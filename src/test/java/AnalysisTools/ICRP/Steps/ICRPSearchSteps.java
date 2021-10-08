package AnalysisTools.ICRP.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import AnalysisTools.ICRP.Pages.ICRPSearchDatabase;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ICRPSearchSteps extends PageInitializer {

	@Given("user on ICRP home page")
	public void user_on_ICRP_home_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ICRP"));
	}

	@When("user clicks ICRP data")
	public void user_clicks_ICRP_data() {
		icrpHomePage.ICRPDataBtn.click();

	}

	@When("user clicks search database")
	public void user_clicks_search_database() {
		icrpHomePage.searchDatabaseBtn.click();
	}

	@When("user clicks search")
	public void user_clicks_search() {
//		WebDriverWait wait = new WebDriverWait(WebDriverUtils.webDriver , 1800); 
//		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@class='btn btn-primary ml2']"))));
		MiscUtils.sleep(5000);
		icrpSearchDatabase.searchBtn.click();
		MiscUtils.sleep(5000);
	}

	@Then("{string} and {string} displays")
	public void and_displays(String totalBaseProjects, String totalProjects) {
		Assert.assertTrue(icrpSearchDatabase.totalBaseProj.getText().contentEquals(totalBaseProjects));
		Assert.assertTrue(icrpSearchDatabase.totalProj.getText().contentEquals(totalProjects));
	}

	@When("user searchs by {string} in search terms")
	public void user_searchs_by_in_search_terms(String gliomaOrganoids) {
		MiscUtils.sleep(5000);
		icrpSearchDatabase.searchTxtbox.sendKeys(gliomaOrganoids);
	}

	@When("user selects exact phrase provided")
	public void user_selects_exact_phrase_provided() {
		icrpSearchDatabase.exactPhraseRadioBtn.click();
	}

	@Then("study titled {string} is displayed")
	public void study_titled_is_displayed(String gliomaOrganoids) {
		Assert.assertTrue(icrpSearchDatabase.projTitles.size() == 1);
		Assert.assertTrue(icrpSearchDatabase.projGliomaOrganoids.getText().contentEquals(gliomaOrganoids));

	}
	
	
	@When("user searchs {string}")
	public void user_searchs(String institutionName) {
		MiscUtils.sleep(5000);
		JavascriptUtils.scrollIntoView(icrpSearchDatabase.institutionPanelHeader);
		icrpSearchDatabase.institutionPanelHeader.click();
		icrpSearchDatabase.institutionTxtBox.sendKeys(institutionName);
	}
	
	@Then("projects with institution as {string} display")
	public void projects_with_institution_as_display(String institutionName) {
		for(int i = 0 ; i < icrpSearchDatabase.institutionUniversityOfColoradoDenver.size(); i++) {
			Assert.assertTrue(icrpSearchDatabase.institutionUniversityOfColoradoDenver.get(i).getText().contentEquals(institutionName));
		}

	}

}