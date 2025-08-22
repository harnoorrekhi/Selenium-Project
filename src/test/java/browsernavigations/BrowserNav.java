package browsernavigations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserNav {
	
	@Test
	
	public void testNavigation() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement FormAuthenticationLink = driver.findElement(By.xpath("//*[@id='content']/ul/li[21]/a"));
		FormAuthenticationLink.click();
		
		driver.navigate().back();
		WebElement homePageHeading = driver.findElement(By.xpath("//*[@id='content']/h1"));
		String heading = homePageHeading.getText();
		
		Assert.assertEquals(heading, "Welcome to the-internet");
		
		driver.navigate().refresh();
		homePageHeading = driver.findElement(By.xpath("//*[@id='content']/h1"));
		heading = homePageHeading.getText();
		
		Assert.assertEquals(heading, "Welcome to the-internet");
		
		driver.navigate().forward();
		homePageHeading = driver.findElement(By.xpath("//*[@id='content']/div/h2"));
		heading = homePageHeading.getText();
		
		Assert.assertEquals(heading, "Login Page");
		
		driver.quit();
		
		
	}

}
