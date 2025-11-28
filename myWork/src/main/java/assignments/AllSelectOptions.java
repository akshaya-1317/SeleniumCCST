package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/samples/select.php");
		

		
		WebElement allSelect = driver.findElement(By.name("languages"));
		Select select = new Select(allSelect);
		Thread.sleep(4000);
		
		//List<WebElement> optionList = select.getOptions();
		//Thread.sleep(4000);

		select.selectByVisibleText("HTML");
		select.selectByVisibleText("CSS");
		select.selectByVisibleText("JavaScript");
		select.selectByVisibleText("TypeScript");
		Thread.sleep(4000);
		
		
		select.selectByVisibleText("Java");
		select.selectByVisibleText("Go");
		select.selectByVisibleText("Python");
		select.selectByVisibleText("Rust");
		select.selectByVisibleText("Kotlin");
		

		Thread.sleep(2000);
		
		driver.quit();
		}

}
