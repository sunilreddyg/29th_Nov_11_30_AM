package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources\\Example_Scenario_Outline.feature",glue="stepDefination",monochrome=true,dryRun=false)

public class Runner2 
{

}
