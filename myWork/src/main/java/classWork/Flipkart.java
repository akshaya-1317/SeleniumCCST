package classWork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
		
			Thread.sleep(3000);
			
			Actions actions = new Actions(driver);
			
			WebElement electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
//			actions.moveToElement(electronics);
			actions.moveToElement(electronics).perform();
			
			WebElement cam = driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
			actions.moveToElement(cam).perform();
			
			WebElement actcam = driver.findElement(By.xpath("//a[text() = 'Sports & action']"));
			actcam.click();
		//	actions.moveToElement(actcam).perform();
			
			Thread.sleep(3000);
			WebElement nex = driver.findElement(By.xpath("//span[text() = 'Next']"));
			actions.scrollToElement(nex).perform();
			
			
			
			
	}

}
