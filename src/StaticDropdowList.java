import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdowList {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
	
	WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown = new Select(staticDropdown);
	dropdown.selectByIndex(1);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("USD");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(1000);
	for(int i = 1; i<5; i++) {
	driver.findElement(By.id("hrefIncAdt")).click();
	
	}
	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
	driver.findElement(By.id("btnclosepaxoption")).click();
	Thread.sleep(1000);
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	driver.findElement(By.id("autosuggest")).sendKeys("ind");
	Thread.sleep(1000);
	List<WebElement> options = driver.findElements(By.cssSelector("li.ui-menu-item a"));
	Thread.sleep(1000);
	for(WebElement option : options) {
		if(option.getText().equalsIgnoreCase("India"))
		{option.click();
		break;
		}
	}
	//ctl00_mainContent_chk_friendsandfamily
	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	
	Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),6);
	
	
}
}
