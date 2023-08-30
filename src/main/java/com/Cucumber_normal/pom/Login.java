package com.Cucumber_normal.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Cucumber_normal.base.Baseclass;


public class Login extends Baseclass implements LoginInter{

	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = sing_class)
	WebElement sing;
	@FindBy (xpath = signin_xapth)
	WebElement sing_in;
	@FindBy (xpath = num_xpath )
	WebElement number;
	@FindBy (id = sub_id)
	WebElement submit;
	
	@FindBy (xpath = verify_xpath)
	WebElement verify;
	
	public WebElement getSing() {
		return sing;
	}
	public WebElement getSing_in() {
		return sing_in;
	}
	public WebElement getNumber() {
		return number;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement getVerify() {
		return verify;
	}


}