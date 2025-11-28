package classWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementsPageAutomation {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/samples/elements.php");
		Thread.sleep(Duration.ofSeconds(2));
		
		 
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("admin");
		Thread.sleep(Duration.ofSeconds(2));
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("admin");
		Thread.sleep(Duration.ofSeconds(2));
		
		WebElement Gender = driver.findElement(By.id("female"));
		Gender.click();
		Thread.sleep(Duration.ofSeconds(2));
		
		WebElement Interests = driver.findElement(By.id("music"));
		Interests.click();
		Thread.sleep(Duration.ofSeconds(2));
		
		WebElement country = driver.findElement(By.id("country"));
		Select cn = new Select(country);
		cn.selectByVisibleText("UK");
		
		WebElement sk = driver.findElement(By.id("skills"));
		Select langs = new Select(sk);
		langs.selectByIndex(0);
		langs.selectByIndex(2);
		langs.selectByIndex(3);
		
		WebElement comments = driver.findElement(By.id("comments"));
		comments.sendKeys("Automation in progress.");
		Thread.sleep(Duration.ofSeconds(2));
		
		WebElement fileUpload = driver.findElement(By.id("fileUpload"));
		String filePath = "C:\\CCST\\akshu.txt";
		fileUpload.sendKeys(filePath);
		

        WebElement dateInput = driver.findElement(By.id("dob"));
        dateInput.sendKeys("04/28/1998");
        
        WebElement btn = driver.findElement(By.id("submitBtn"));
        btn.click();
        
        
	}
}
