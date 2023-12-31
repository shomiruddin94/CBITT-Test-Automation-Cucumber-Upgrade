package CustomBusiness.ETD.StepsImplementation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;

public class ETDFlowStepsImpl extends PageInitializer {

	public void etdLogin(String userName) throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ETD"));
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		MiscUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		MiscUtils.sleep(3000);
		CommonUtils.click(etdAdminNCIPage.inputFieldChangeUser);
		MiscUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, userName);
		//JavascriptUtils.enterValueByJS(etdAdminNCIPage.inputFieldChangeUser, userName);
		MiscUtils.sleep(4000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(etdAdminNCIPage.dropdownChangeUser);
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenShot();
	}

	public void selectTab(String tab) {
		if (tab.equalsIgnoreCase("Home")) {
			CommonUtils.click(etdAdminNCIPage.homeTab);
			MiscUtils.sleep(2000);
		} else if (tab.equalsIgnoreCase("About ETD")) {
			CommonUtils.click(etdAdminNCIPage.aboutETDTab);
			MiscUtils.sleep(2000);
		} else if (tab.equalsIgnoreCase("Manage ETD")) {
			CommonUtils.click(etdAdminNCIPage.manageETDTab);
			MiscUtils.sleep(2000);
		} else {
			CommonUtils.click(etdAdminNCIPage.manageRolesTab);
			MiscUtils.sleep(2000);
		}
	}

	public void verifyContent(String content) {
		if (content.equalsIgnoreCase("Home")) {
			Assert.assertTrue(etdAdminNCIPage.titleHomeTab.isDisplayed());
			MiscUtils.sleep(2000);
			CucumberLogUtils.logScreenShot();
		} else if (content.equalsIgnoreCase("About ETD")) {
			Assert.assertTrue(etdAdminNCIPage.titleAboutETD.isDisplayed());
			MiscUtils.sleep(2000);
			CucumberLogUtils.logScreenShot();
		} else if (content.equalsIgnoreCase("Manage ETD")) {
			Assert.assertTrue(etdAdminNCIPage.organizationNCI.isDisplayed());
			MiscUtils.sleep(2000);
			CucumberLogUtils.logScreenShot();
		} else {
			Assert.assertTrue(etdAdminNCIPage.titleManageRoles.isDisplayed());
			MiscUtils.sleep(2000);
			CucumberLogUtils.logScreenShot();
		}
	}

	public void selectTierUser(String tier) {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		MiscUtils.sleep(3000);
		CommonUtils.click(etdAdminNCIPage.inputFieldChangeUser);
		MiscUtils.sleep(4000);
		if (tier.equalsIgnoreCase("Tier User1")) {
			CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "ABER, ETAN");
			MiscUtils.sleep(4000);
			CucumberLogUtils.logScreenShot();
			CommonUtils.click(etdAdminNCIPage.dropdownChangeUser);
			MiscUtils.sleep(3000);
		} else if (tier.equalsIgnoreCase("Tier User2")) {
			CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "ADAMS, GREGORY");
			MiscUtils.sleep(4000);
			CucumberLogUtils.logScreenShot();
			CommonUtils.click(etdAdminNCIPage.dropdownChangeUser);
			MiscUtils.sleep(3000);
		} else if (tier.equalsIgnoreCase("Tier User3")) {
			CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "BILD, ANDREA");
			MiscUtils.sleep(4000);
			CucumberLogUtils.logScreenShot();
			CommonUtils.click(etdAdminNCIPage.dropdownChangeUser);
			MiscUtils.sleep(3000);
		} else {
			CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "BERG, LESLIE");
			MiscUtils.sleep(4000);
			CucumberLogUtils.logScreenShot();
			CommonUtils.click(etdAdminNCIPage.dropdownChangeUser);
			MiscUtils.sleep(3000);
		}
	}

	public void selectAlert(String alert) {
		if (alert.equalsIgnoreCase("content of Tier1")) {
			Assert.assertTrue(etdAdminNCIPage.tier1Alert.isDisplayed());
			MiscUtils.sleep(2000);
			CucumberLogUtils.logScreenShot();
		} else if (alert.equalsIgnoreCase("content of Tier2")) {
			Assert.assertTrue(etdAdminNCIPage.tier2Alert.isDisplayed());
			MiscUtils.sleep(2000);
			CucumberLogUtils.logScreenShot();
		} else if (alert.equalsIgnoreCase("content of Tier3")) {
			Assert.assertTrue(etdAdminNCIPage.tier3Alert.isDisplayed());
			MiscUtils.sleep(2000);
			CucumberLogUtils.logScreenShot();
		} else {
			Assert.assertTrue(etdAdminNCIPage.tier3DAlert.isDisplayed());
			MiscUtils.sleep(2000);
			CucumberLogUtils.logScreenShot();
		}
	}

	public void selectTier(String tier) {
		if (tier.equalsIgnoreCase("All")) {
			CommonUtils.click(etdAdminNCIPage.searchButton);
			MiscUtils.sleep(30000);
			CucumberLogUtils.logScreenShot();
		} else if (tier.equalsIgnoreCase("Tier I")) {
			CommonUtils.click(etdAdminNCIPage.tierDropdown);
			MiscUtils.sleep(30000);
			CommonUtils.click(etdAdminNCIPage.tierSearch);
			MiscUtils.sleep(2000);
			CommonUtils.sendKeys(etdAdminNCIPage.tierSearch, "Tier I");
			MiscUtils.sleep(2000);
			etdAdminNCIPage.tierSearch.sendKeys(Keys.ENTER);
			MiscUtils.sleep(7000);
			JavascriptUtils.scrollIntoView(etdAdminNCIPage.searchButton);
			CommonUtils.click(etdAdminNCIPage.searchButton);
			MiscUtils.sleep(3000);
			CucumberLogUtils.logScreenShot();
		} else if (tier.equalsIgnoreCase("Tier II   ")) {
			CommonUtils.click(etdAdminNCIPage.tierDropdown);
			MiscUtils.sleep(2000);
			CommonUtils.click(etdAdminNCIPage.tierSearch);
			MiscUtils.sleep(2000);
			CommonUtils.sendKeys(etdAdminNCIPage.tierSearch, "Tier II");
			MiscUtils.sleep(2000);
			etdAdminNCIPage.tierSearch.sendKeys(Keys.ENTER);
			MiscUtils.sleep(2000);
			JavascriptUtils.scrollIntoView(etdAdminNCIPage.searchButton);
			CommonUtils.click(etdAdminNCIPage.searchButton);
			MiscUtils.sleep(3000);
			CucumberLogUtils.logScreenShot();
		} else if (tier.equalsIgnoreCase("Tier III")) {
			CommonUtils.click(etdAdminNCIPage.tierDropdown);
			MiscUtils.sleep(30000);
			CommonUtils.click(etdAdminNCIPage.tierSearch);
			MiscUtils.sleep(2000);
			CommonUtils.sendKeys(etdAdminNCIPage.tierSearch, "Tier III");
			MiscUtils.sleep(2000);
			etdAdminNCIPage.tierSearch.sendKeys(Keys.ENTER);
			MiscUtils.sleep(2000);
			JavascriptUtils.scrollIntoView(etdAdminNCIPage.searchButton);
			CommonUtils.click(etdAdminNCIPage.searchButton);
			MiscUtils.sleep(3000);
			CucumberLogUtils.logScreenShot();
		} else {
			CommonUtils.click(etdAdminNCIPage.tierDropdown);
			MiscUtils.sleep(30000);
			CommonUtils.click(etdAdminNCIPage.tierSearch);
			MiscUtils.sleep(2000);
			CommonUtils.sendKeys(etdAdminNCIPage.tierSearch, "Tier III-D");
			MiscUtils.sleep(2000);
			etdAdminNCIPage.tierSearch.sendKeys(Keys.ENTER);
			MiscUtils.sleep(2000);
			JavascriptUtils.scrollIntoView(etdAdminNCIPage.searchButton);
			CommonUtils.click(etdAdminNCIPage.searchButton);
			MiscUtils.sleep(3000);
			CucumberLogUtils.logScreenShot();
		}
	}
	public void verifyContentTier(String content) {
		if (content.equalsIgnoreCase("contentAll")) {
			MiscUtils.sleep(3000);
			List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[3]"));
			System.out.println(namesList);
			for (WebElement each : namesList) {
				System.out.println("Tier  " + each.getText());
			}
			CucumberLogUtils.logScreenShot();
		} else if (content.equalsIgnoreCase("content1")) {
			MiscUtils.sleep(3000);
			List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[3]"));
			System.out.println(namesList);
			for (WebElement each : namesList) {
				System.out.println("Tier  " + each.getText());
			}
			CucumberLogUtils.logScreenShot();
		} else if (content.equalsIgnoreCase("content2")) {
			MiscUtils.sleep(3000);
			List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[3]"));
			System.out.println(namesList);
			for (WebElement each : namesList) {
				System.out.println("Tier  " + each.getText());
			}
			CucumberLogUtils.logScreenShot();
		} else if (content.equalsIgnoreCase("content3")) {
			MiscUtils.sleep(3000);
			List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[3]"));
			System.out.println(namesList);
			for (WebElement each : namesList) {
				System.out.println("Tier  " + each.getText());
			}
			CucumberLogUtils.logScreenShot();
		} else {
			List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[3]"));
			System.out.println(namesList);
			for (WebElement each : namesList) {
				System.out.println("Tier  " + each.getText());
			}
			CucumberLogUtils.logScreenShot();
		}
	}
}