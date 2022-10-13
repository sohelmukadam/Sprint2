package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features="Feature/OrderDetails.feature",
glue= {"StepDefinitions"}//"classpath:reference-to-stepDef-folder" 
)
public class OrderDetailsRunner extends AbstractTestNGCucumberTests{

}
