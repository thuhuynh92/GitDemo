import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshot {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://google.com");
	
	driver.manage().window().maximize();
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	org.openqa.selenium.io.FileHandler.copy(src, new File("C:\\Users\\Anh Thu\\Selenium Screenshot\\screenshot164.png"));
}
}
