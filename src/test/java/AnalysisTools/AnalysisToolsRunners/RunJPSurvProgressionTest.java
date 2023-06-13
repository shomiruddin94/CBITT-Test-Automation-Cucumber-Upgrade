package AnalysisTools.AnalysisToolsRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		, features="src/test/java/AnalysisTools/JPSurv/Features"
		, glue="AnalysisTools.JPSurv.Steps"
		, tags="@Progression"
		, dryRun = false
		, monochrome=true
		, strict = true
		
		)

public class RunJPSurvProgressionTest {

}
