package com.cg.registration.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"Features"},
   glue= {"com.cg.registration.stepdefinitions"},
   tags= {"@register"})
public class TestRunner {

}
