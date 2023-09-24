package org.adactinrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\org\\adactinfeature\\Adac.feature",glue="org.adacstep",monochrome=true,publish=true,dryRun = false)


public class AdacRunner {

}
