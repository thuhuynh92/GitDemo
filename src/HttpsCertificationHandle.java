

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HttpsCertificationHandle {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.setAcceptInsecureCerts(true);
	Proxy proxy = new Proxy();
	proxy.setHttpProxy("ipaddress:4444");
	options.setCapability("proxy", proxy);
	Map<String, Object> prefs = new HashMap<String, Object>();
	prefs.put("download.default_directory","/directory/path");
	options.setExperimentalOption("prefs", prefs);
	
	
	
	WebDriver driver = new ChromeDriver(options);
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://expired.badssl.com/");
	
}
}
