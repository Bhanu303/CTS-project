package com.project.demo.runner;


import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
				 glue = {"com.project.demo.stepdefinition.Laptop"},
				 tags = {" @TC02_Demoblaze"},
				 plugin = {"pretty","html:target/cucumber" },
				 monochrome=true
)

public class Laptop_TestRunner {
 

}

