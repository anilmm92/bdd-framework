package com.anil.automation.test.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features"}, glue = {"com.anil.automation.test.steps"}
,monochrome=true, plugin = {"pretty","html:target/htmlReports/report.html"},tags= "@SmokeScenario")
public class CucumberTestRunner {

}
