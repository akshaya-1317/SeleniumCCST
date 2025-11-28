package LabCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/espocrm");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		By LocUsername = By.id("field-userName");
		WebElement UsernameText = driver.findElement(LocUsername);
		UsernameText.sendKeys("admin");
		
		Thread.sleep(3000);
		
		By LocPassword = By.name("password");
		WebElement PasswordText = driver.findElement(LocPassword);
		PasswordText.sendKeys("admin");
		
		Thread.sleep(3000);
		
		By LocLogin = By.tagName("button");
		WebElement Loginbtn = driver.findElement(LocLogin);
		Loginbtn.click();
		
		driver.navigate().to("http://localhost/espocrm/#Account");
		
//		By AccountsTab = By.linkText("Accounts");
//		WebElement AccountsOption = driver.findElement(AccountsTab);
//	    AccountsOption.click();
		
	    System.out.println("Not selected.");
		
		
		
	    By chkBox = By.className("form-checkbox");
	    WebElement CheckOption = driver.findElement(chkBox);
	    CheckOption.click();
	    System.out.println("selected.");
	}

}
