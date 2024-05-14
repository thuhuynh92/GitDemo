import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAssignment {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Multiple Windows")).click();
	driver.findElement(By.linkText("Click Here")).click();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	String parentId = it.next();
	String childId = it.next();
	driver.switchTo().window(childId);
	System.out.println(driver.findElement(By.cssSelector("div.example")).getText());
	driver.switchTo().window(parentId);
	System.out.println(driver.findElement(By.cssSelector(" div[class='example'] h3")).getText());
	
	

}
}
