package com.anil.automation.test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Loginpage_steps {
	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/anilmm92/eclipse-workspace/bdd-framework/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.navigate().to("https://example.testproject.io/web/");
		Thread.sleep(2000);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
	}

	@Then("user is navigating to home page")
	public void user_is_navigating_to_home_page() {
		driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
		driver.quit();
	}

}
