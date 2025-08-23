package dropdownselect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownMulti {

	@Test
	public void testMulti() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/harno/OneDrive/Desktop/dropdown.html");
		
		WebElement multiSelect = driver.findElement(By.xpath("//*[@id='cars']"));
		
		Select selectsm = new Select(multiSelect);
		
		selectsm.selectByIndex(1);
		
		selectsm.selectByValue("saab");
		
		selectsm.selectByVisibleText("Audi");
		
		selectsm.selectByContainsVisibleText("Opel");
		
		
		selectsm.deSelectByContainsVisibleText("Opel");
		
		selectsm.deselectByIndex(1);
		
		selectsm.deselectByValue("saab");
		
		selectsm.deselectByVisibleText("Audi");
		
		selectsm.deselectAll();
		
		driver.quit();
		
	}
	
}
