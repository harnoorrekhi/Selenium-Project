package mytests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void verifySuccessLogin() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://the-internet.herokuapp.com/");

		WebElement formAuthenticationLink = driver.findElement(By.xpath("//*[@id='content']/ul/li[21]/a"));
		formAuthenticationLink.click();

		WebElement usernameTextField = driver.findElement(By.xpath("//*[@id='username']"));
		usernameTextField.sendKeys("tomsmith");

		WebElement passwordTextField = driver.findElement(By.xpath("//*[@id='password']"));
		passwordTextField.sendKeys("SuperSecretPassword!");

		WebElement loginbutton = driver.findElement(By.xpath("//*[@id='login']/button/i"));
		loginbutton.click();

		WebElement ConfirmationMessageElement = driver.findElement(By.xpath("//*[@id='content']/div/h4"));
		String message = ConfirmationMessageElement.getText();

		Assert.assertEquals(message, "Welcome to the Secure Area. When you are done click logout below.", "I want to go back home");

		driver.quit();

	}

}
