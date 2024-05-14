import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	driver.switchTo().newWindow(WindowType.TAB);
	Set <String> handles = driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	String parentWindow = it.next();
	String childWindow = it.next();
	driver.switchTo().window(childWindow);
	driver.get("https://rahulshettyacademy.com/");
	String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
	driver.switchTo().window(parentWindow);
	WebElement name = driver.findElement(By.cssSelector("[name = 'name']"));
	name.sendKeys(courseName);
	File file = name.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("logo.png"));
	System.out.println(name.getRect().getDimension().getHeight());
	System.out.println(name.getRect().getDimension().getWidth());
	
	
	
}
}
