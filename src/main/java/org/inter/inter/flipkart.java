package org.inter.inter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class flipkart {
	WebDriver driver;


	@Given("^user is in Flipkart page$")
	public void user_is_in_Flipkart_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Senthil\\Desktop\\Project Class WorkSpace\\inter\\driver\\chromedriver.exe");
	driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
	    
	}

	@When("^user search the  iphone (\\d+)s in flipkart$")
	public void user_search_the_iphone_s_in_flipkart(String[] args ) {
		
driver.findElement(By.xpath("//*[@class='2AkmmA _29YdH8']")).click();
driver.findElement(By.xpath("//*[@name='q']")).sendKeys();
	}

	@When("^user search the  samsung s(\\d+) in flipkart$")
	public void user_search_the_samsung_s_in_flipkart(String[] args) throws Throwable {
	  
	}

	@When("^user search the  iphone x in flipkart$")
	public void user_search_the_iphone_x_in_flipkart(String[] args) throws Throwable {
	
	}

	@Then("^user added the product in cart$")
	public void user_added_the_product_in_cart(String[] args) throws Throwable {
	    
	}
}
