

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameAssignment {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
	driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_top']")));
	driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_middle']")));
	System.out.println(driver.findElement(By.cssSelector("div#content")).getText());
}
}
