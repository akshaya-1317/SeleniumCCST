
package LabCodes;

import java.util.Set;

import org.openqa.selenium.Dimension;

//import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		//System.out.println("hello");
		WebDriver driver = new ChromeDriver();
//		driver = new ChromeDriver();
//		WebDriver driver1 = new FirefoxDriver();
//		WebDriver driver2 = new EdgeDriver();
		
		String Url = "https://www.google.com/";
		
		
		driver.get(Url);
	//	System.out.println("URL is", driver.get(Url)));
	//	driver.manage().wait(5);
		
		String currentURL= driver.getCurrentUrl();
		System.out.println(currentURL);
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
	//	driver.wait(4);
	//	driver.quit();
		
		driver.navigate().to("https://cdac.in/");
	//	driver.wait(4);
		Thread.sleep(4000);
	//	driver.navigate().back();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		Point windowPosition = driver.manage().window().getPosition();
	    System.out.println("window x position:" + windowPosition.getX());
	    System.out.println("window y position:" + windowPosition.getY());
	    
	    Point pt = new Point(100,40);
	    driver.manage().window().setPosition(pt);
	    
	    Thread.sleep(4000);
	    
	
	    driver.manage().window().setSize(new Dimension(600, 200));
	    
	//    driver.manage().window().getSize();
	    
	//    LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
	//    System.out.println(logEntries);
	  
	    Set<String> lgs = driver.manage().logs().getAvailableLogTypes();
	    System.out.println(lgs);
	    
	    LogEntries logEntries = driver.manage().logs().get("browser");
		System.out.println(logEntries);
	    
	    
	  
	
		
//		Thread.sleep(4000);
//		driver.navigate().to("https://www.sunbeaminfo.com/");
//		driver.navigate().refresh();
	
	//	driver.quit();
		
		
		
		
		
	}

}
