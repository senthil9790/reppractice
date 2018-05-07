package org.inter.inter;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class demo {
	 WebDriver driver;
	  
	@Given("^User is in demqa page$")
	public void user_is_in_demqa_page()  {
    System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Senthil\\Desktop\\Project Class WorkSpace\\inter\\driver\\chromedriver.exe");
      driver = new ChromeDriver();
	  driver.get("http://demoqa.com/registration/");
		
	}

	@When("^user want to check the textbox$")
	public void user_want_to_check_the_textbox() {
		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Senthil");
		driver.findElement(By.name("last_name")).sendKeys("Murugan");
		driver.findElement(By.xpath("//*[@id='phone_9']")).sendKeys("9988776655");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("senthilmurugans");
		driver.findElement(By.xpath("//*[@id='email_1']")).sendKeys("sen97901@gmail.com");
		driver.findElement(By.xpath("//*[@id='description']")).sendKeys("something else to do");
		driver.findElement(By.xpath("//*[@id='password_2']")).sendKeys("123456@987");
		driver.findElement(By.xpath("//*[@id='confirm_password_password_2']")).sendKeys("123456@987");
	 
	}

	@When("^user want to check radio button$")
	public void user_want_to_check_radio_button() {
		driver.findElement(By.xpath("//*[@name='radio_4[]']")).click();
	
	}
	@When("^user want to check checkbox$")
	public void user_want_to_check_checkbox() {
	    driver.findElement(By.xpath("//*[@name='checkbox_5[]'][1]")).click();
	    driver.findElement(By.xpath("//*[@name='checkbox_5[]'][2]")).click();
	    driver.findElement(By.xpath("//*[@name='checkbox_5[]'][3]")).click();
	}

	@When("^user want to check dropdown$")
	public void user_want_to_check_dropdown()  {
	    org.openqa.selenium.support.ui.Select dpdncount = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("dropdown_7")));
	    dpdncount.selectByVisibleText(" India");
	}




}



