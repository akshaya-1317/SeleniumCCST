package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationinespocrm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/espocrm");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id='btn-login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='#Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//input[@data-name='name']")).sendKeys("Akshaya");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@data-name='website']")).sendKeys("abc.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);

		
		
		driver.findElement(By.xpath("//textarea[@data-name='billingAddressStreet']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@data-name='billingAddressCity']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@data-name='billingAddressState']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@data-name='billingAddressPostalCode']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@data-name='billingAddressCountry']")).sendKeys("ABCD");
		
		
		driver.findElement(By.xpath("//textarea[@data-name='shippingAddressStreet']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@data-name='shippingAddressCity']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@data-name='shippingAddressState']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@data-name='shippingAddressPostalCode']")).sendKeys("56789");
		driver.findElement(By.xpath("//input[@data-name='shippingAddressCountry']")).sendKeys("ABCD");

		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//div[@class='option selectize-dropdown-emptyoptionlabel selected']")).click();
		
		
		WebElement type1 = driver.findElement(By.xpath("(//*[@class='selectize-control form-control main-element single plugin-espo_select'])[1]"));
		type1.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@data-value='Investor']")).click();
		
		driver.findElement(By.xpath("(//*[@class='selectize-control form-control main-element single plugin-espo_select'])[2]")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//div[@data-value='Banking']")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//textarea[@data-name='description']")).sendKeys("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//button[@data-name='save']")).click();

		driver.quit();
		
		
		
		
		

	}

}



