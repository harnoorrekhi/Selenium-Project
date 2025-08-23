package dropdownselect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownValue {

	@Test
	public void testmyDD() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement DropdownLink = driver.findElement(By.xpath("//*[@id='content']/ul/li[11]/a"));
		DropdownLink.click();	
		
		WebElement dd = driver.findElement(By.xpath("//*[@id='dropdown']"));
		
		Select selectdd = new Select(dd);
		
		selectdd.selectByIndex(1);
		
		selectdd.selectByValue("2");
		
		selectdd.selectByVisibleText("Option 1");
		
		selectdd.selectByContainsVisibleText("Option 2");
		
		driver.quit();
		
		
	}
}
