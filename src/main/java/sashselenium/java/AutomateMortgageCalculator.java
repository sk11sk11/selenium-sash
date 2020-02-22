package sashselenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AutomateMortgageCalculator {

	public static void main(String[] args) {
		WebDriver driver = Library.launchChrome("https://www.mortgagecalculator.org/");
		
		driver.findElement(By.xpath("//label[text()=' Home Value: ']/following-sibling::input")).clear();
		driver.findElement(By.xpath("//label[text()=' Home Value: ']/following-sibling::input")).sendKeys("250000");
		
		driver.findElement(By.xpath("//label[text()=' Down payment: ']/following-sibling::input")).clear();
		driver.findElement(By.xpath("//label[text()=' Down payment: ']/following-sibling::input")).sendKeys("50000");
		
		driver.findElement(By.xpath("//label[text()=' Loan Amount: ']/following-sibling::input")).clear();
		driver.findElement(By.xpath("//label[text()=' Loan Amount: ']/following-sibling::input")).sendKeys("200000");
		
		driver.findElement(By.name("param[interest_rate]")).clear();
		driver.findElement(By.name("param[interest_rate]")).sendKeys("5");
		
		driver.findElement(By.xpath("//label[text()=' Loan Term: ']/following-sibling::input")).clear();
		driver.findElement(By.xpath("//label[text()=' Loan Term: ']/following-sibling::input")).sendKeys("15");
		
		WebElement startMonthElement= driver.findElement(By.name("param[start_month]"));
		Select obj = new Select(startMonthElement);
		obj.selectByVisibleText("Apr");
		
		Library.clearAndTypeValue(driver.findElement(By.id("start_year")), "2020");
		Library.clearAndTypeValue(driver.findElement(By.id("pptytax")), "3000");
		Library.clearAndTypeValue(driver.findElement(By.id("pmi")), "0.1");
		Library.clearAndTypeValue(driver.findElement(By.id("hoi")), "2300");
		Library.clearAndTypeValue(driver.findElement(By.id("hoa")), "100");
		
		WebElement LoanType = driver.findElement(By.name("param[milserve]"));
		Select obj2 = new Select(LoanType);
		obj2.selectByVisibleText("USDA");
		
		WebElement BuyOrRefi = driver.findElement(By.name("param[refiorbuy]"));
		Select obj3 = new Select(BuyOrRefi);
		obj3.selectByVisibleText("Buy");
		
		WebElement CreditRating = driver.findElement(By.name("param[credit_rating]"));
		Select obj4 = new Select(CreditRating);
		obj4.selectByVisibleText("Excellent (720+)");
		
		driver.findElement(By.name("cal")).click();
		//page reloads after click which takes time;  adding try catch and sleep to wait for page to load completely.
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		WebElement monthlyPayment =driver.findElement(By.xpath("(//div[@class='repayment-block']//h3)[1]"));
		String mpay = monthlyPayment.getText();
		System.out.println("Monthly payment is: "+mpay);
		

	}

}
