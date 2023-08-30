package com.Cucumber_normal.step;

import java.util.concurrent.TimeUnit;

import com.Cucumber_normal.base.Baseclass;
import com.Cucumber_normal.pom.PagaObjectManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_defination extends Baseclass {
	
	PagaObjectManager pa = new PagaObjectManager();
	
	@Given("User launch the browser with Url {string}")
	public void user_launch_the_browser_with_url(String string) {
	    
	    getUrl("https://www.nykaa.com/");
	}
	
	//@Given("User launch the browser with Url")
	//public void user_launch_the_browser_with_url() {
	 // getUrl("https://www.nykaa.com/");
	 	
//}
	
@When("User able to click the Signin button")
public void user_able_to_click_the_signin_button() {
	clickOnWebelem(pa.getL().getSing());
	clickOnWebelem(pa.getL().getSing_in());
	
}
@And("User able to enter the mobile number")
public void user_able_to_enter_the_mobile_number() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	passAData(pa.getL().getNumber(),"9940567237");
}
@And("User able to enter the OTP")
public void user_able_to_enter_the_otp() {
	clickOnWebelem(pa.getL().getSubmit());
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {			
	e.printStackTrace();
	}
}
@Then("User able to click the Verify button")
public void user_able_to_click_the_verify_button() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    javascriptexe(pa.getL().getVerify(), "click");
}

}

