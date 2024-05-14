import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;


public class ActionDemo {
public static void main(String[] args) {
	FirefoxOptions options = new FirefoxOptions();
    options.setBinary("/usr/lib/firefox/firefox");
    FirefoxDriver driver = new FirefoxDriver(options);
	driver.get("https://www.amazon.com/?ref_=nav_custrec_signin");
	Actions a = new Actions(driver);
	WebElement move = driver.findElement(By.cssSelector("//a[@id='nav-link-accountList']"));
	a.moveToElement(move).build().perform();
	System.out.println("hello");
	System.out.println("hello2");
}
}
