package sashselenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MortgageCalcSite {

	public static void main(String[] args) {
		WebDriver driver = Library.launchChrome("https://www.mortgagecalculator.org/");
		
		//driver.findElement(By.id("homeval")).sendKeys("1000");
		Library.clearAndTypeValue(driver.findElement(By.id("homeval")), "250000");
		///input[@name='param[homevalue]']
		//(//input[@class='right-cell'])[1]
		////label[text()=' Home Value: ']
		////label[text()=' Home Value: ']/following-sibling::input
		
		
		
		//driver.findElement(By.id("downpayment")).sendKeys("6000");
		Library.clearAndTypeValue(driver.findElement(By.name("param[downpayment]")), "10000");
		
		//driver.findElement(By.id("loanamt")).sendKeys("240000");
		Library.clearAndTypeValue(driver.findElement(By.id("loanamt")), "240000");
		
		//driver.findElement(By.id("intrstsrate")).sendKeys("4");
		Library.clearAndTypeValue(driver.findElement(By.id("intrstsrate")), "4");
		//driver.findElement(By.id("loanterm")).sendKeys("15");
		Library.clearAndTypeValue(driver.findElement(By.id("loanterm")), "15");
		
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
		
	}

}
