package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features="Feature/ProfileDetailsEdit.feature",
glue= {"StepDefinitions"}//"classpath:reference-to-stepDef-folder" 
)
public class ProfileDetailsEditRunner extends AbstractTestNGCucumberTests{

}