package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",dryRun=true,
glue="stepDefinitions",monochrome=true, 
tags="@RegressionTest or @Smoke or @NetBanking or @Mortgage",
plugin = {"pretty", "html:target/cucmber.html", "json:target/cucumber.json"})

public class TestNGRunner extends AbstractTestNGCucumberTests{

}
