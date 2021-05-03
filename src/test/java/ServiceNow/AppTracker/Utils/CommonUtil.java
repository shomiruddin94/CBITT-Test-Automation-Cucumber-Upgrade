package ServiceNow.AppTracker.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.nci.automation.web.WebDriverUtils;

public class CommonUtil {

	public static void waitBrowser(int ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
}
