package com.TestRunnerCamp.qa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.UtilityCamp.qa.BaseCamp;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

  @CucumberOptions(features={"src/test/campresources/DemoCampfeatures"},
                   plugin= {"json:target/cucumber.json"},                    
                    //  glue="StepDepCamp",  tags={"@Login"})
                   //glue="StepDepCamp",  tags={"@Signup"})
                    // glue="StepDepCamp",  tags={"@contact"})
                   // glue="StepDepCamp",  tags={" @Aboutus"})
                  glue="StepDepCamp",  tags={"@Homeheader"})
                  // glue="StepDepCamp",  tags={"@Cart"})
                   
                   

  public class DemoCampRunner  extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void startURL() {
		BaseCamp Test = new BaseCamp();
		Test.initCampBrowser();
		
	}
	
	@AfterTest
	public  void closeURL() {
		BaseCamp Test = new BaseCamp();
		Test.driver.quit();
		
	}
}
