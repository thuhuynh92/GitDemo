import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scroll(0,600)");
	List <WebElement> list = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr"));
	System.out.println(list.size());
	
	
	System.out.println("There are "+driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).size()+" rows");
	System.out.println("There are "+driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th")).size()+" columns");
	System.out.println(driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).get(2).findElements(By.tagName("td")).get(0).getText());
	System.out.println(driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).get(2).findElements(By.tagName("td")).get(1).getText());
	System.out.println(driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).get(2).findElements(By.tagName("td")).get(2).getText());
}
}











