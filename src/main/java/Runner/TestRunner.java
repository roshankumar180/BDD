package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "H:/eclipse/FreeCrmBDDFramework/src/main/java/Features/login.feature",
	glue = {"stepDefinition"},
	format= {"pretty", "html: test-output", "json: json_output/cucumber.json", "junit: junit_xml/cucumber.xml"},
	monochrome=true,
	dryRun=false,
	strict=true

)

public class TestRunner {
	
}
