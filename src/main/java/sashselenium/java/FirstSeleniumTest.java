package sashselenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Automate google search page to verify the search functionality.
		 * 
		 * 1. Open Chrome browser
		 * 2. Go to google.com
		 * 3. Search "Hello World" in search textbox.
		 * 4. Click on Search button.
		 * 5. Verify search results page.
		 * 6. Close browser.
		 * 
		 * 
		 */
		
		//WebDriverManager.chromedriver().setup();
	
		System.setProperty("webdriver.chrome.driver", "/Users/shashank/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		/*
		 * 
		 * Locators:  9 Types
		 * 
		 * 
		 *
		 */
		driver.findElement(By.name("q")).sendKeys("Hello World"+Keys.ENTER);
		String title=driver.getTitle();
		System.out.println("Title of search page: "+ title);
		driver.close();
		driver.quit();
		
		/*
		 * Write a selenium test that should navigate to http://newtours.demoaut.com/
		 */

	}

}
