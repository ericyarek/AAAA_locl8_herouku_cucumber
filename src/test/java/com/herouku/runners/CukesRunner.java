package com.herouku.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports",
				"json:target/cucumber.json"
		
		},
		
		tags="@SPA-1264",
		features="src/test/resources/com/herouku/features", 
		glue="com/herouku/step_definitions"
		,dryRun = false
		)
public class CukesRunner {}
