package com.Cucumber_normal.runner;




import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Cucumber_normal.base.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\Cucumber_normal\\src\\test\\java\\Feature\\ny.feature",
                 glue = "com.Cucumber_normal.step", monochrome= true, 
                 
                 plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                 )
public class Runner extends Baseclass {

	@BeforeClass
	public static void broser() {
		browserLaunch("chrome");

	}
}
