package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalVisibleHiddenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int TotalLinks = allLinks.size();
        System.out.println("Total Links: " + TotalLinks);

		
		int visibleLinks = 0;
        int hiddenLinks = 0;

        for (WebElement link : allLinks) {
            if (link.isDisplayed()) {
                visibleLinks++;
            } else {
                hiddenLinks++;
            }
        }
        
    
        System.out.println("Visible Links: " + visibleLinks);
        System.out.println("Hidden Links: " + hiddenLinks);

      
        driver.quit();
		
	}

}
