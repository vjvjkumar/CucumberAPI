package com.pim.migration.controller;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources",plugin = "json:target/cucumber-report.json")
public class CucumberTest {
}