package domtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementsTest {

	@Test
	public void Dom() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		List<WebElement> listDOM = driver.findElements(By.partialLinkText("DOM"));
		
		 for (WebElement domLink : listDOM) {
	            System.out.println(domLink.getText());
	        }
		 driver.quit();
				
		
		
		
		
		
		
	}
}
