package runnerClassPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "C:\\Selenium_Workspace\\CucumberProject\\src\\main\\java\\featurePackage\\bdd.feature",
@CucumberOptions(features = {"C:\\Selenium_Workspace\\CucumberProject\\src\\main\\java\\featurePackage"},
glue={"stepDefPackage"},
         format={"pretty", "html:test-output","junit:junit_xml/cucumber.xml"},
         dryRun = false,
         monochrome=true
         //strict=true
	     )

public class Runner {

}
