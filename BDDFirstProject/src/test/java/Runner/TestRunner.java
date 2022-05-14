package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(
		 features = {"src/test/resources/features\\CreatTask.feature"},
			        glue = {"Stepdefinations"},
			       plugin = {"html:target/cucumber-html-report"},
			        monochrome = true
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}



