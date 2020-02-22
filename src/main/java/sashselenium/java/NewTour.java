package sashselenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTour {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/shashank/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		//driver.findElement(By.name("q")).sendKeys("Hello World"+Keys.ENTER);
		String title=driver.getTitle();
		System.out.println("Title of search page: "+ title);
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("hmenu-customer-profile-right")).click();
		
		
		//driver.close();
		//driver.quit();

	}

}
