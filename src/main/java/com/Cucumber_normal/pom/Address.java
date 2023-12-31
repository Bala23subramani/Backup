package com.Cucumber_normal.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address implements Address_inter {
	
	WebDriver driver;
	
	public Address() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (className = pincode_class)
	WebElement pincode;
	@FindBy (className = Flat_class)
	WebElement Flat_no;
	@FindBy (className = addr_class)
	WebElement addr;
	@FindBy (className = submit_class)
	WebElement submit;
	
	
	
	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getFlat_no() {
		return Flat_no;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void address() {
		WebElement pincode = driver.findElement(By.className("input-element  "));
		pincode.sendKeys("600116");
		WebElement Flat_no = driver.findElement(By.className("input-element  "));
		Flat_no.sendKeys("No 4");
		WebElement addr = driver.findElement(By.className("input-element input-area "));
		addr.sendKeys("ABCD");
		WebElement submit = driver.findElement(By.className("css-mq2cy2 e8tshxd0"));
		submit.click();

	}
}
