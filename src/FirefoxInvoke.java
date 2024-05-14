import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxInvoke {
	public static void main(String[] args) {
	    try {
	        FirefoxOptions options = new FirefoxOptions();
	        options.setBinary("/usr/lib/firefox/firefox");
	        FirefoxDriver driver = new FirefoxDriver(options);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://www.google.com");

	        Thread.sleep(5000);
	        System.out.println(driver.getTitle());

	        driver.close();
	    } catch (Exception E) {
	        E.printStackTrace();
	    }
	}
}
