import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckAble_Disable {
public static void main(String[] args) {
WebDriver  driver = new ChromeDriver();

driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
		System.out.println("Its enable");
		Assert.assertTrue(true);
	}
	else {Assert.assertTrue(false);
	
	}
	
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
		System.out.println("Its disable");
		Assert.assertTrue(true);
	}
	else {Assert.assertTrue(false);
	
	}
}
}
