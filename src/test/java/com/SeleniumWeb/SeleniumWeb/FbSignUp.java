package com.SeleniumWeb.SeleniumWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbSignUp {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		System.out.println(" Title : "+driver.getTitle());
		driver.manage().window().maximize();
		System.out.println(" Current Url : "+driver.getCurrentUrl());
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Devendra");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("devendra@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("devendra@gmail.com");
		//driver.findElement(By.name("reg_email__")).sendKeys("8123273639");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Dev12345");
		driver.findElement(By.name("birthday_day")).sendKeys("17");
		driver.findElement(By.name("birthday_month")).sendKeys("Mar");
		driver.findElement(By.name("birthday_year")).sendKeys("1995");
		//driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
//		driver.findElement(By.xpath("//label[contains(text(),'Custom')]")).click();
//		driver.findElement(By.name("preferred_pronoun")).sendKeys("He: Wish him a happy birthday");
//		driver.findElement(By.name("custom_gender")).sendKeys("ABC");
		//driver.close();
		//driver.quit();
}
}