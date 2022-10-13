package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features="Feature/ProfileDetails.feature",
glue= {"StepDefinitions"}//"classpath:reference-to-stepDef-folder" 
)
public class ProfileDetailsRunner extends AbstractTestNGCucumberTests{

}