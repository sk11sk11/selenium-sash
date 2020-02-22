package sashselenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingSite2 {

	public static void main(String[] args) {
		String url = "http://shop.demoqa.com";
		System.setProperty("webdriver.chrome.driver", "/Users/shashank/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement message = driver.findElement(By.tagName("address"));
		System.out.println(message.getText());
		
		//WebElement telephone = driver.findElement(By.xpath("//span[text()='T']/../a"));
		WebElement telephone = driver.findElement(By.xpath(".//span[text()='T']//following-sibling::a"));
		System.out.println(telephone.getText());
		
		WebElement email = driver.findElement(By.xpath("//a[@class='phone-text']"));
		System.out.println(email.getText());
		
		WebElement mail = driver.findElement(By.xpath(".//span[text()='M']//following-sibling::a"));
		System.out.println(mail.getText());
	}

}
