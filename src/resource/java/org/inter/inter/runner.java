package org.inter.inter;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java"},tags= {"@demo"},glue = { "inter" } ,plugin = { "pretty",
"html:target/cucumber-html-report" })

public class runner {

}
