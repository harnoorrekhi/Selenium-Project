package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject {

	public static void main(String[] args) {

		// Launch Chrome
		// Go to site- https://the-internet.herokuapp.com/login
		// Click on Form Authentication
		// Enter username- tomsmith
		// Enter password- SuperSecretPassword!
		// Click on Login
		// Validate that user sees the message - "Welcome to the Secure Area. When you
		// are done click logout below."

		// Launch Chrome
		WebDriver driver = new ChromeDriver();

		// Go to site- https://the-internet.herokuapp.com/login
		driver.get("https://the-internet.herokuapp.com/");

		// Click on Form Authentication
		WebElement formAuthenticationLink = driver.findElement(By.xpath("//*[@id='content']/ul/li[21]/a"));
		formAuthenticationLink.click();

		// Enter username
		WebElement usernameTextField = driver.findElement(By.xpath("//*[@id='username']"));
		usernameTextField.sendKeys("tomsmith");

		// Enter Password
		WebElement passwordTextField = driver.findElement(By.xpath("//*[@id='password']"));
		passwordTextField.sendKeys("SuperSecretPassword!");

		// Click on Login
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id='login']/button/i"));
		loginbutton.click();

		// Validate that user sees the message
		WebElement ConfirmationMessageElement = driver.findElement(By.xpath("//*[@id='content']/div/h4"));
		String message = ConfirmationMessageElement.getText();

		if (message.equals("Welcome to the Secure Area. When you are done click logout below.")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		driver.quit();

	}

}
