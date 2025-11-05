package com.Capium365.RunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
                            // change here your Feature file path
@CucumberOptions(features="src\\test\\resources\\Capium365FeatureFiles\\LoginFeature.feature",
            glue="com.Capium365.StepDefination" ,
            plugin= {"pretty",
            		"html:target/cucumber-reports/CucumberReport.html", "json:target/cucumber-reports/CucumberReport.json",
    				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)

public class LoginRunner extends AbstractTestNGCucumberTests{

}
