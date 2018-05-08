package org.inter.inter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Senthil\\Desktop\\Project Class WorkSpace\\inter\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
driver.findElement(By.xpath("//*[@href='/sitemap?otracker=undefined_footer_navlinks']")).click();

}
}
