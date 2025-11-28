package classWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EspoAccounts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/espocrm");
		Thread.sleep(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id='btn-login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='#Account']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='test']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Edit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@data-name='website']")).sendKeys("http.abcd.in");
		
		

		
//		WebElement Username = driver.findElement(By.name("username"));
//		Username.sendKeys("admin");
//		
//		WebElement Password = driver.findElement(By.name("password"));
//		Password.sendKeys("admin");
//		
//		WebElement btnLogin = driver.findElement(By.tagName("button"));
//		btnLogin.click();
//		
//		driver.findElement(By.xpath("//a[@href='#Account']")).click();		
	}

}
