import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SelIntroduction {
//public static void main(String[] args) {
//	//Invoking Browser
//	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Anh Thu\\chromedriver.exe");
//	//WebDriver driver = new ChromeDriver();
	// System.setProperty("webdriver.gecko.driver","C:\\Users\\Anh
	// Thu\\geckodriver-v0.34.0-win64 (1)\\geckodriver.exe");

	// WebDriver driver = new FirefoxDriver();
//	
//	driver.get("https://vi.wikipedia.org/wiki/Hawaii");
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());
//	driver.close();
//	driver.quit();
//	
//	
//	
//}
//}
	public static void main(String[] args) {
		try {
			
//			 System.setProperty("webdriver.edge.driver","C:\\Users\\Anh Thu\\Edgedriver\\msedgedriver.exe");
//			 WebDriver driver = new EdgeDriver();
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Anh Thu\\geckodriver-v0.34.0-win64 (1)\\geckodriver.exe");
			
			FirefoxOptions options = new FirefoxOptions();
	        options.setBinary("/usr/lib/firefox/firefox");
	        FirefoxDriver driver = new FirefoxDriver(options);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://support.mozilla.org/en-US/kb/configure-firewalls-so-firefox-can-access-internet");

			Thread.sleep(5000);
			System.out.println(driver.getTitle());

			System.out.println(driver.getCurrentUrl());
			driver.close();
		} catch (Exception E) {
			E.printStackTrace();
		}
	}
}