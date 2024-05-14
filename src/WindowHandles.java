import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindowHandles {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
	driver.findElement(By.cssSelector("a.blinkingText")).click();
	Set<String> windows = driver.getWindowHandles();
Iterator<String> it = windows.iterator();
String parentID = it.next();
String childID = it.next();
driver.switchTo().window(childID);
System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
String emailId = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
driver.switchTo().window(parentID);
driver.findElement(By.id("username")).sendKeys(emailId);

	
}
}
