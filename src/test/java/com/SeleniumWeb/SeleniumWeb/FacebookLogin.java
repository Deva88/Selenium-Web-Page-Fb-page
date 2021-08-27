package com.SeleniumWeb.SeleniumWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumWeb/SeleniumWeb/Driver/Chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		System.out.println(" Title : "+driver.getTitle());
		driver.manage().window().maximize();
		System.out.println(" Current Url : "+driver.getCurrentUrl());
		driver.findElement(By.name("email")).sendKeys("devendra.raj.sdm@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Deva@8824264173");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		Thread.sleep(3000);
//		driver.close();
//		driver.quit();
	}

}