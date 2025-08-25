package xpath;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PracticeXpath {
	@Test
	public void practice() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://with-bugs.practicesoftwaretesting.com");
		
		WebElement Categories = driver.findElement(By.xpath("//li[@class='nav-item dropdown']"));
		Categories.click();
		
		WebElement PowerToolsLink = driver.findElement(By.xpath("//a[@href='#/category/power-tools']"));
		PowerToolsLink.click();
		
		WebElement SortList = driver.findElement(By.className("form-select"));
		SortList.click();
		Select sl = new Select(SortList);
		sl.selectByVisibleText("Price (High - Low)");
		
		WebElement CircularSaw = driver.findElement(By.xpath("//a[@href='#/product/21']"));
		CircularSaw.click();
		
		driver.quit();
	}
} 

//Absolute xpath for unsplash element--> //html/body/app-root/app-footer/div/p/a[4]

// 5 Xpath for Thor Hammer
//div/a[9]
//a[@href='#/product/9']
//div[@class='container']/a[9]
//div[@class='col-md-9']/div/a[9]
//a[@data-test='product-9']



// 5 Xpath for Plier	
// div/a[2]
//a[@href='#/product/2']
// div[@class='container']/a[2]
// a[@data-test='product-2']
// div[@class='col-md-9']/div/a[2]

	

