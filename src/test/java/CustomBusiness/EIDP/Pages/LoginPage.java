package CustomBusiness.EIDP.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;

public class LoginPage extends CommonUtil{
	
	@FindBy(how = How.ID, id = "USER")
	public WebElement username;
	
	@FindBy(how = How.ID, id = "PASSWORD")
	public WebElement password;
	
	@FindBy(how = How.CSS, css = "button[onclick='return submitForm(1);']")
	public WebElement signInButton;
	
	@FindBy(how = How.CSS, css = ".fa.fa-user")
	public WebElement changeUserButton;
	
	@FindBy(how = How.XPATH, xpath = "//button[@id='dropdown-change-user']")
	public WebElement changeUser;  
	
	@FindBy(how = How.XPATH, xpath = "//input[@id='undefinedTypeahead']")
	public WebElement changeUserInput;
	
	@FindBy(how = How.ID, id= "select2-input-changeUser-container")
	public WebElement changeUserDropdown;
	
	@FindBy(how = How.CSS, css = "input[type='search']")
	public WebElement searchableChangeUserInput;

	@FindBy(how = How.CSS, css = "li[role='treeitem']")
	public WebElement changeUserOption;
	
	public LoginPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}	
	
}
