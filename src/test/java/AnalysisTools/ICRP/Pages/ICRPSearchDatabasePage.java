package AnalysisTools.ICRP.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ICRPSearchDatabasePage extends CommonUtils {

	@FindBy(xpath = "//*[@class='btn btn-primary ml2']")
	public WebElement searchBtn;

	@FindBy(xpath = "//*[@tooltip='Parent projects']")
	public WebElement totalBaseProj;

	@FindBy(xpath = "//*[@tooltip='Including linked sub-projects or supplements']")
	public WebElement totalProj;

	@FindBy(xpath = "//*[@tooltip='Enter search terms']")
	public WebElement searchTxtbox;

	@FindBy(xpath = "(//input[@type='radio'])[3]")
	public WebElement anyOfTheKeywordsBtn;

	@FindBy(xpath = "//tr[@class='ng-star-inserted']")
	public List<WebElement> projTitles;

	@FindBy(xpath = "//*[@title=' Glioma organoids as patient avatars to improve precision medicine']")
	public WebElement projGliomaOrganoids;

	@FindBy(xpath = "(//*[@class='ui-panel-header'])[2]")
	public WebElement institutionPanelHeader;

	@FindBy(xpath = "//*[@id='institution']")
	public WebElement institutionTxtBox;

	@FindBy(xpath = "//*[@title='University of Colorado Denver']")
	public List<WebElement> institutionUniversityOfColoradoDenver;

	@FindBy(xpath = "(//*[@class='ui-panel-header'])[3]")
	public WebElement fundingPanelHeader;

	@FindBy(xpath = "//*[@value='127']")
	public WebElement ALSFChkbox;

	@FindBy(xpath = "(//*[@title='ALSF'])[1]")
	public WebElement fundingOrgALSF;

	@FindBy(xpath = "(//*[@class='ui-panel-header'])[4]")
	public WebElement cancerTypePanelHeader;

	@FindBy(xpath = "(//*[@placeholder='Select Cancer Types'])[2]")
	public WebElement cancerTypeTxtbox;

	@FindBy(xpath = "//li[contains(text(), 'Brain Tumor')]")
	public WebElement brainTumortxt;

	@FindBy(xpath = "(//*[@class='btn btn-default ml2'])[1]")
	public WebElement resetBtn;

	@FindBy(xpath = "(//*[@class='btn btn-default ml2'])[2]")
	public WebElement clearBtn;

	@FindBy(xpath = "(//*[@_ngcontent-c5])[3]")
	public WebElement allProjTxt;

	@FindBy(xpath = "(//*[@class='ui-panel-header'])[5]")
	public WebElement researchAreaPanelHeader;

	@FindBy(xpath = "//*[contains(text(),'1.1 Normal Functioning')]")
	public WebElement normalFunctioningChkbox;
	
	@FindBy(xpath = "//*[@href='/project/128199']")
	public WebElement  proj3DPrinting;
	
	@FindBy(xpath ="//table/tbody/tr/td[1]/a")
	public List<WebElement> projectTitles;
	
	@FindBy(xpath = "(//*[contains(text(),' Email')])[1]")
	public WebElement emailResultsBtn;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement emailNameTxtbox;	
	
	@FindBy(xpath = "//input[@placeholder='Enter multiple email recipients, separated by commas']")
	public WebElement emailRecipientTxtbox;
	
	@FindBy(xpath = "//button[normalize-space()='Send Email']")
	public WebElement emailSubmitBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Your email has been sent successfully!')]")
	public WebElement emailSuccessMsg;
	
	
	@FindBy(xpath = "//button[normalize-space()='Export']")
	public WebElement exportBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Projects (Multi-Sheets)']")
	public WebElement projectMultisheetBtn;

	public ICRPSearchDatabasePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
