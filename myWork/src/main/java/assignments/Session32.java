package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session32 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/samples/elements.php");
		
		WebElement che = driver.findElement(By.id("sports"));
		
		public void check(WebElement ele){
			
			if(che.isSelected()){
				
			}
		
		}
		
		
		
//		Public void check(WebElement)
//		if(element.isSelected()) {
//			element.click();
		}

	}


