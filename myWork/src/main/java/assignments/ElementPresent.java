package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresent {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	
		   List<WebElement> elements = driver.findElements(By.id("radio-btn-example"));
	        if (elements.size() > 0) {
	            System.out.println("Element is present");
	        } else {
	            System.out.println("Element is not present");
	        }
	
	
	}

}
