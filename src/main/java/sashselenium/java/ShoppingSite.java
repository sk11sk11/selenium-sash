package sashselenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingSite {

	public static void main(String[] args) {
		String url = "http://shop.demoqa.com";
		System.setProperty("webdriver.chrome.driver", "/Users/shashank/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		//store into webelement
		WebElement message = driver.findElement(By.xpath("/html/body/p"));
		System.out.println(message.getText());
		
		//driver.findElement(By.xpath("/html/body/p/a")).click();
		//Class Name
		driver.findElement(By.className("woocommerce-store-notice__dismiss-link")).click();
		
		//LinkText
		driver.findElement(By.linkText("Dismiss")).click();
		//partial link text
		driver.findElement(By.partialLinkText("miss")).click();
		//Tagname
		driver.findElement(By.tagName("a")).click();
		
		
		

	}

}
