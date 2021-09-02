package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinitions"},
tags= {"@test"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReports"},
strict=true

)

public class TestRunner1 {

}
