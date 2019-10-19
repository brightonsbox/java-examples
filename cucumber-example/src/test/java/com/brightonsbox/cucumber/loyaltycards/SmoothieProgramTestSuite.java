package com.brightonsbox.cucumber.loyaltycards;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:com/brightonsbox/cucumber/loyaltycards/features",
        glue = "com.brightonsbox.cucumber.loyaltycards"
)
public class SmoothieProgramTestSuite {

}
