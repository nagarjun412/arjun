package com.facebook;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "‪D:\\DRIVERS\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("email_create")).sendKeys("arjunreddy546965@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		Thread.sleep(3000);
		/*WebElement radio=//input[@id='customer_firstname']
		driver.findElement(By.id("id_gender1"));
		radio.click();
		System.out.println(radio.isSelected());
		Thread.sleep(3000);*/
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("arjun");
		driver.findElement(By.name("customer_lastname")).sendKeys("reddy");
		
		driver.findElement(By.name("passwd")).sendKeys("arjun@123");
		org.openqa.selenium.support.ui.Select sel1=new org.openqa.selenium.support.ui.Select(driver.findElement(By.name("days")));
		
		sel1.selectByIndex(5);
org.openqa.selenium.support.ui.Select sel2=new org.openqa.selenium.support.ui.Select(driver.findElement(By.name("months")));
		
		sel2.selectByIndex(6);
org.openqa.selenium.support.ui.Select sel3=new org.openqa.selenium.support.ui.Select(driver.findElement(By.name("years")));
		
		sel3.selectByValue("1988");
		WebElement chekbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		if (!chekbox.isSelected()) {
			chekbox.click();
			
		}
		driver.findElement(By.id("firstname")).sendKeys("arjun");
		driver.findElement(By.id("lastname")).sendKeys("reddy");
		driver.findElement(By.id("company")).sendKeys("spglobal");
		driver.findElement(By.id("address1")).sendKeys("hederabad");
		driver.findElement(By.id("address2")).sendKeys("ameerpet");
		driver.findElement(By.id("city")).sendKeys("hyderabad");
		org.openqa.selenium.support.ui.Select sel4=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("id_state")));
		sel4.selectByVisibleText("Indiana");
		driver.findElement(By.id("postcode")).sendKeys("50090");
		Thread.sleep(2000);
		driver.findElement(By.id("other")).sendKeys("i am new to theis app so i just wanted to create my account in this");
		driver.findElement(By.id("phone")).sendKeys("9052456356");
		driver.findElement(By.id("phone_mobile")).sendKeys("9989565423");
		driver.findElement(By.id("alias")).sendKeys("hederabad nijampet");
		driver.findElement(By.id("submitAccount")).click();
	   
	    System.out.println( driver.getCurrentUrl());
	    
	

				

	}

}
