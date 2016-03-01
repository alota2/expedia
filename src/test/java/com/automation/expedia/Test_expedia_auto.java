package com.automation.expedia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_expedia_auto {
	WebDriver driver = new FirefoxDriver();
	
  @Test (priority=1)
  public void plantrip() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://expedia.com");
	  driver.findElement(By.cssSelector("a#tab-flight-tab")).click();
	  driver.findElement(By.id("flight-origin")).sendKeys("NYC");
	  driver.findElement(By.id("flight-destination")).sendKeys("Chicago");
	  driver.findElement(By.id("flight-departing")).sendKeys("12/31/2015");
	  driver.findElement(By.id("flight-returning")).sendKeys("01/07/2016");
	  driver.findElement(By.id("search-button")).click();
	 

	

	  //expedia_branch1 commit
	  //expedia_branch1 second commit



      // from expedia_branch1l

  }
}
