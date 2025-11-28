package pomSele;

import org.openqa.selenium.WebDriver;

import pomSele.LoginPage;

public class LoginTestCase {

	private LoginPage login;
	public LoginTestCase(WebDriver driver) {
		login = new LoginPage(driver);
	}
	
	public void validLogin() {
		login.login("admin", "admin");
	}
}
