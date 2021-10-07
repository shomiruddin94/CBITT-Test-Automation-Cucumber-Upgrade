package AnalysisTools.mSigPortal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SignatureExplorerPages extends CommonUtils {

	public SignatureExplorerPages() {

		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}
	
	@FindBy (xpath = "(//strong[contains(text(),'SBS24')])[1]")
	public WebElement calculateOnExplorerTab;
	
	@FindBy (xpath = "(//button[contains(text(),'Download Plot')])[1]")
	public WebElement downloadFirstPlotOnSignatureExplorer;
	
	@FindBy (xpath = "(//a[contains(text(),'Exposure')])[1]")
	public WebElement exposureTabOnSignatureExposureSection;
	
	@FindBy (xpath = "//button[contains(text(),'Calculate All')]")
	public WebElement calculateAllButtonOnExposureTab;
	
	@FindBy (xpath ="(//img[@class='w-100'])[1]")
	public WebElement imageOnExposureSearch;

}
