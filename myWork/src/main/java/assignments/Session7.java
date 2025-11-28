package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/espocrm");
		
		System.out.println("Before Set: "+driver.manage().timeouts().getImplicitWaitTimeout().getSeconds());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Duration timeout = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println("After Set: "+timeout.getSeconds());
	
	

		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id='btn-login']")).click();
		System.out.println("Login Successful!");
	
		driver.quit();
		
		
	}

}
