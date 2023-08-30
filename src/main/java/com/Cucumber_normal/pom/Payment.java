package com.Cucumber_normal.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment implements Payment_inter {
	
	WebDriver driver;
	
	public Payment() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = card_xpath)
	WebElement card;
	@FindBy (xpath =date_xpath)
	WebElement date;
	@FindBy (xpath =cvv_xpath)
	WebElement cvv;
	@FindBy (className =proceed_class)
	WebElement proceed;
	@FindBy (className =pay_class)
	WebElement pay;
	@FindBy (className =currency_class)
	WebElement currency;
	@FindBy (className =pay_now)
	WebElement paynow;
	@FindBy (className =failed)
	WebElement payment_failed;
	
	public WebElement getCard() {
		return card;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getPay() {
		return pay;
	}

	public WebElement getCurrency() {
		return currency;
	}

	public WebElement getPaynow() {
		return paynow;
	}

	public WebElement getPayment_failed() {
		return payment_failed;
	}

	public void payment() {
		WebElement card = driver.findElement(By.xpath("//input[@label='Card Number']"));
		card.sendKeys("5425233430109903");
		WebElement date = driver.findElement(By.xpath("//input[@label='Expiry (MM/YY)']"));
		date.sendKeys("05/12");
		WebElement cvv = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
		cvv.sendKeys("564");
		WebElement proceed = driver.findElement(By.className("css-v61n2j e8tshxd0"));
		proceed.click();
		WebElement pay = driver.findElement(By.className("css-v61n2j e8tshxd0"));
		pay.click();
		WebElement currency = driver.findElement(By.className("checkmark"));
		currency.click();
		WebElement paynow = driver.findElement(By.className("pay-btn"));
		paynow.click();
		WebElement payment_failed = driver.findElement(By.className("css-1iwzqhf emgaj5l0"));
		payment_failed.click();
		
		
	}
}
