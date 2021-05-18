package ServiceNow.AppTracker.StepsImplementation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.AppTracker.Pages.VacancyManagerUserPage;
import appsCommon.PageInitializer;

public class VacancyManagerUserStepsImpl extends PageInitializer {


	public void verifyVacancyDashboardHeader() throws TestingException {
		String actualText = vacancyManagerUserPage.vacancyDashboardPageHeader.getText();
		CucumberLogUtils.logScreenShot();
		String expectedText = "Vacancy Dashboard";
		MiscUtils.sleep(2000);
		Assert.assertEquals("Verifying Vacancy Manager sees Vacancy Dashboard text", expectedText, actualText);
	}

	//public void enterVacancyDescFromSourceDoc() {
	    
		
	public void selectRecommendationLetter() {
		JavascriptUtils.scrollDown(7000);
		CommonUtils.click(vacancyManagerUserPage.lettersOfRecommendation);
		MiscUtils.sleep(2000);
	}
	public void verifyNumberOfLettersOfRecommendation() {
		JavascriptUtils.scrollUp(600);
		MiscUtils.sleep(2000);
		Assert.assertEquals("It is present", vacancyManagerUserPage.numberOfLettersOfRecommendation.getText(),"2" + " recommendations");
		
	}
	
	public void verifyTabsOnVacancyManagerPage(List<String> names) {
		List <WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//p[@class='vacancy-desc']"));
		System.out.println("size of all tabs " + namesList.size());
		
		for(WebElement each : namesList) {	
		System.out.println("each tab name "+ each.getText());
		
		if(names.contains(each.getText())){
			System.out.println("true");
			
		} else {
			System.out.println("false");
		}
		
		}
	}
	
	public void verifyTabsCountOnVacancyManagerPage() {
		List <WebElement> countList = WebDriverUtils.webDriver.findElements(By.xpath("//p[@class='num-count']"));
		System.out.println("count of all tabs " + countList.size());
		
		for(WebElement each : countList) {	
		System.out.println("each count of all tabs "+ each.getText());
		
		
		}
	}
	

	public void selectOpenDate(String date) {
		vacancyManagerUserPage.openCalendarInputButtonInBasicVacancySection.sendKeys(date);
	}
	
	public void selectCloseDate(String date) {
		vacancyManagerUserPage.closeCalendarInputButtonInBasicVacancySection.sendKeys(date);
	}



}

