package com.Cucumber_normal.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;

	public static void browserLaunch(String value) {
		if (value.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		} else if (value.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (value.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else {
			System.out.println("Doesn't Exist");
		}
	}

	public static void exit() {
		driver.quit();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void screenShot(String imgName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\rmuth\\eclipse-workspace\\Indigo\\Screenshot\\" + imgName + ".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void impWait(int sec) {

		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void navigation(String navigate) {
		if (navigate.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (navigate.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (navigate.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}

	}

	public static void getWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		while (iterator.hasNext()) {
			String window = iterator.next();
			String title = driver.switchTo().window(window).getTitle();
			System.out.println(title);
		}
	}

	public static void mouseActions(String value, WebElement element) {
		Actions act = new Actions(driver);

		if (value.equalsIgnoreCase("clickOnElement")) {
			act.click(element).perform();
		} else if (value.equalsIgnoreCase("rightclick")) {
			act.contextClick(element).perform();

		} else if (value.equalsIgnoreCase("hover")) {
			act.moveToElement(element).build().perform();
		} else if (value.equalsIgnoreCase("doubleclick")) {
			act.doubleClick(element).perform();

		}
	}

	public static void javascriptexe(WebElement element, String option) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (option.equals("View")) {
			js.executeScript("arguments[0].scrollIntoView()", element);
		} else if (option.equals("click")) {
			js.executeScript("arguments[0].click()", element);
		} else if (option.equals("scroll")) {
			int number = Integer.parseInt(option);
			js.executeScript("window.ScrollBy(0," + number + ")");
		}
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void passAData(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clickOnWebelem(WebElement element) {
		element.click();
	}
}
