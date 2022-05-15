package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources\\FirstFile.feature",glue="stepDefination",monochrome=true)
public class Runner1 
{
	

}
