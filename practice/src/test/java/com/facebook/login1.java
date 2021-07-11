package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arjunreddy6965@gmail.com");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("arjun@123");
		driver.findElement(By.id("SubmitLogin")).click();
		
		if (driver.getTitle().equals("My account - My Store")) {
			System.out.println("title is matched");
			
		}else {
			System.out.println("title is not matched");
		}
		driver.getTitle();
		System.out.println(driver.getTitle());
	}

}
