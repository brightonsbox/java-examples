package com.brightonsbox.cucumber.loyaltycards;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:com/brightonsbox/cucumber/loyaltycards/features",
        glue = "com.brightonsbox.cucumber.loyaltycards"
)
public class SmoothieProgramTestSuite {

}
