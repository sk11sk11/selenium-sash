package sashselenium.java.testng;

import org.testng.annotations.Test;

import sashselenium.java.Library;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class FirstTestNG {

	WebDriver driver;  //create a global variable (create it outside the function) so it can be accessed in functions.
	
  @Test
  public void myfirstTestcase() {
	  System.out.println("My First Testcase is running");
	  driver = Library.launchChrome("https://letskodeit.teachable.com/p/practice");
	  driver.findElement(By.id("bmwradio")).click();
	  
	
	  /*
	  WebElement carselect = driver.findElement(By.id("carselect"));
		Select obj2 = new Select(carselect);
		obj2.selectByVisibleText("Benz");
		*/
	  
		new Select(driver.findElement(By.id("carselect"))).selectByIndex(1);
		new Select(driver.findElement(By.id("multiple-select-example"))).selectByIndex(1);
		
		driver.findElement(By.xpath("(//input[@name='cars' and @type='checkbox'])[1]")).click();
	  	  
  }
  
  @Test
  public void mysecondTestcase() {
	  System.out.println("My Second Testcase is running");	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am running @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am running @AfterTest");
	  //driver.close();
  }

}
