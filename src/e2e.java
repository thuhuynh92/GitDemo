import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class e2e {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.cssSelector("a[value='BLR']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	driver.findElement(By.cssSelector("a.ui-state-highlight")).click();
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {

		Assert.assertTrue(true);
	}else {Assert.assertTrue(false);
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(1000);
	for(int i=1; i<5; i++) {
	driver.findElement(By.id("hrefIncAdt")).click();
	}
	
	WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown = new Select (staticDropdown);
	dropdown.selectByIndex(2);
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
}
}}
