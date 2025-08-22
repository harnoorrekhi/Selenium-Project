package browsernavigations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControls {

	@Test
	public void DynaControl() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/");

		WebElement DynamicControl = driver.findElement(By.xpath("//*[@id='content']/ul/li[13]/a"));
		DynamicControl.click();

		driver.navigate();
		WebElement homePageHeading = driver.findElement(By.xpath("//*[@id='content']/div[1]/h4[1]"));
		String heading = homePageHeading.getText();

		Assert.assertEquals(heading, "Dynamic Controls");

		WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkbox']"));
		checkbox.click();

		WebElement RemoveButton = driver.findElement(By.xpath("//*[@id='checkbox-example']/button"));
		RemoveButton.click();

		WebElement messageGone = driver.findElement(By.id("message"));
		Assert.assertTrue(messageGone.isDisplayed(), "It's gone!");

		WebElement EnableButton = driver.findElement(By.xpath("//*[@id='input-example']/button"));
		EnableButton.click();

		WebElement messageEnabled = driver.findElement(By.id("message"));
		Assert.assertTrue(messageEnabled.isDisplayed(), "It's enabled!");

		driver.quit();
	}
}
