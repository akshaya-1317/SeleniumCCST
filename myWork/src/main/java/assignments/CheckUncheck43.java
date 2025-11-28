package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUncheck43 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();

	driver.findElement(By.xpath("//input[@name='checkBoxOption2']")).click();

	driver.findElement(By.xpath("//input[@name='checkBoxOption3']")).click();
	
	driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
	
	driver.findElement(By.xpath("//input[@name='checkBoxOption2']")).click();
}

}
