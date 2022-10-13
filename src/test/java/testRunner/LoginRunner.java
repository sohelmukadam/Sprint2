package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features="Feature/Login.feature",
glue= {"StepDefinitions"}//"classpath:reference-to-stepDef-folder" 
)
public class LoginRunner extends AbstractTestNGCucumberTests{

}
