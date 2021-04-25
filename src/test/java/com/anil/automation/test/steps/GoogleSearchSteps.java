package com.anil.automation.test.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step - browser_is_open");
		System.setProperty("webdriver.chrome.driver","C:/Users/anilmm92/eclipse-workspace/bdd-framework/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		System.out.println("Inside step - user_is_on_google_search_page");
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	}

	@And("user enters a text")
	public void user_enters_a_text() throws InterruptedException {
		System.out.println("Inside step - user_enters_a_text");
		driver.findElement(By.name("q")).sendKeys("java tutorials");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside step - user_is_navigated_to_search_results");
		driver.close();
		driver.quit();

	}
}
