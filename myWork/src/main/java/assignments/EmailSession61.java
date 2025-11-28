package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailSession61 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/espocrm");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id='btn-login']")).click();
		Thread.sleep(3000); 
		
		driver.findElement(By.xpath("//span[text()='Emails']")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("[data-name=\"composeEmail\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("[class=\"input-group\"]>input[autocomplete=\"espo-to\"]")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input[autocomplete=\"espo-cc\"]")).sendKeys("xyz@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[autocomplete=\"espo-bcc\"]")).sendKeys("xyz@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div[class=\"selectize-control form-control radius-left single plugin-espo_select\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div[data-value=\"Opportunity\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[data-name=\"parentName\"]")).sendKeys("abc");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[data-name=\"selectTemplateName\"]")).sendKeys("abc");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[data-name=\"subject\"]")).sendKeys("xyz");
		Thread.sleep(6000);
		
		WebElement file = driver.findElement(By.xpath("//input[@type='file']"));
			//	file.click();
				file.sendKeys("C:\\Users\\CCST\\Desktop/akshu.txt");
		Thread.sleep(3000);
		
		
		
	//	sendKeys("‪‪C:\\Users\\CCST\\Desktop\\akshu.txt");
		
		
		driver.findElement(By.cssSelector("button[data-name=\"send\"]")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
	}

}
