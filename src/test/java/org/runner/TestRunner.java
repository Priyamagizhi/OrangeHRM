package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilityclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
                 glue="org.stepdefinition",
                //dryRun=true)
                dryRun=false,
                plugin= {"pretty",
                		"json:src//test//resources//reports//jsonreport//jsonorange.json",
                		"junit:src//test//resources//reports//junitreport//junitorange.xml"
                })
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		BaseClass.generateJVMReport("src//test//resources//reports//jsonreport//jsonorange.json");
		System.out.println("-----Successfully generated-----");
	}
	
	
	
	
	
	
}
