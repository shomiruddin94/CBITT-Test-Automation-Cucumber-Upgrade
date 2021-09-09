package AnalysisTools.mSigPortal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SignatureVisualizationsPage extends CommonUtils {

	public SignatureVisualizationsPage() {

		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}

	/** These are the elements on the Signature Visualizations Page */

	/** Data Sources User radio button value */
	@FindBy(xpath = "//input[@id='radioUser']")
	public WebElement userDataSourceRadioButton;

	/** Load Example Data button */
	@FindBy(xpath = "//button[contains(text(),'Load Example Data')]")
	public WebElement loadExampleDataButton;

	/** Submit button on signature visualization tab */
	@FindBy(xpath = "(//button[contains(text(),'Submit')])[1]")
	public WebElement submitButton;

	/** The Remove File button on the signature visualization tab */
	@FindBy(xpath = "//button[contains(text(),'Remove File')]")
	public WebElement removeFilesButton;

	/** Profile Comparison tab web element */
	@FindBy(xpath = "(//button[contains(text(),'Profile Comparison')])[1]")
	public WebElement profileComparisonTab;

	/** PC to Reference tab on profile comparison */
	@FindBy(xpath = "//strong[contains(text(),'PC to Reference Signatures')]")
	public WebElement pcToReferenceTab;

	/** Sample name 1 drop down */
	@FindBy(xpath = "(//div[@class=' css-2b097c-container'])[14]")
	public WebElement sample1Dropdown;

	/** Sample name 2 drop down */
	@FindBy(xpath = "(//div[@class=' css-2b097c-container'])[15]")
	public WebElement sample2Dropdown;

	/** Calculate button on Profile comparison tab */
	@FindBy(xpath = "(//button[contains(text(),'Calculate')])[6]")
	public WebElement calculateButtonOnPcToReferenceTab;

	/**
	 * This is the plot of data returned on the profile comparison tab on the PC to
	 * Reference Tab
	 */
	@FindBy(xpath = "(//div[@class='react-transform-element TransformComponent-module_content__TZU5O '])[2]")
	public WebElement plotReturnedOnProfileComparison;

	/** This is the download plot link web element */
	@FindBy(xpath = "(//button[contains(text(),'Download Plot')])[1]")
	public WebElement downloadPlotOnProfileSummary;

	/** This is the download section tab on the Signature Visualizations page */
	@FindBy(xpath = "(//button[contains(text(),'Download')])[1]")
	public WebElement downloadTab;

	/** This is the description of the download tab */
	@FindBy(xpath = "//p[contains(text(),'were successfully analyzed.')]")
	public WebElement downloadDescriptionText;
	
	/** This is the Mutational Profiles section Tab at the top of the screen */
	@FindBy (xpath = "(//button[contains(text(),'Mutational Profiles')])[1]")
	public WebElement mutationalProfileTab;
	
	/** This is the Sample Name text box under mutational profile tab */
	@FindBy (xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[4]")
	public WebElement mutationalProfileSampleNameTextBox;
	
	/** This is the Sample Name text box under mutational profile tab's "SB749362" value */
	@FindBy (xpath = "//div[contains(text(),'SB749362')]")
	public WebElement mutationalProfileSampleNameBorder;
	
	/** This is the Cosine Similarity tab  */
	@FindBy (xpath = "(//button[contains(text(),'Cosine Similarity')])[1]")
	public WebElement cosineSimilarityTab;
	
	/** This is the CS Within Samples tab under the Cosine Similarities tab */
	@FindBy (xpath = "//strong[contains(text(),'CS Within Samples')]")
	public WebElement csWithinSamplesTab;
	
	/** This is the Cosine Similarity Within Samples calculate button  */
	@FindBy (xpath = "(//button[contains(text(),'Calculate')])[1]")
	public WebElement csWithinSamplesCalculateButton;
	
	/** This is the CS to Reference tab under the Cosine Similarities tab */
	@FindBy (xpath = "//strong[contains(text(),'CS to Reference Signatures')]")
	public WebElement csToReferenceTab;
	
	/** This is the Cosine Similarity to Reference Signatures calculate button  */
	@FindBy (xpath = "(//button[contains(text(),'Calculate')])[2]")
	public WebElement csToReferenceSignaturesCalculateButton;
	
	/** This is the CS to Public Data tab under the Cosine Similarities tab */
	@FindBy (xpath = "//strong[contains(text(),'CS to Public Data')]")
	public WebElement csToPublicDataTab;
	
	/** This is the Cosine Similarity to Public Data calculate button  */
	@FindBy (xpath = "(//button[contains(text(),'Calculate')])[3]")
	public WebElement csToPublicDataCalculateButton;
	
	

}
