package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features="Feature",
glue= {"StepDefinitions"}//"classpath:reference-to-stepDef-folder" 
)
public class testAll extends AbstractTestNGCucumberTests{

}