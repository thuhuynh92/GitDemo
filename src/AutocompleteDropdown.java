import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutocompleteDropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("autocomplete")).sendKeys("Ind");
	Thread.sleep(3000);
//	List<WebElement> items = driver.findElements(By.tagName("li"));
//	
	String country = "India";
//	for (int i = 0;i<items.size(); i++) {
//		if(items.get(i).getText().contains(country)) {
//			items.get(i).click();
//			break;
//		}
//		
//	}
	driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	Assert.assertEquals(driver.findElement(By.id("autocomplete")).getAttribute("value"), country);
	
}
}
