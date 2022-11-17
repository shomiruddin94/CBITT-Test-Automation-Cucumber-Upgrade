package ServiceNow.ServiceNowRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty" }, features = "src/test/java/ServiceNow/NERD/Features", 
		glue = "ServiceNow.NERD.Steps", 
		tags = "@3", 
		dryRun = true, 
		monochrome = true, 
		strict = true

)

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run
 * cucumber feature(s).
 * 
 * @author sohilz2
 */
public class RunNERDProgressionTest {

}
