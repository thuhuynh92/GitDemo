import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinksHandle {
public static void main(String[] args) throws MalformedURLException, IOException {
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a "));
	SoftAssert a = new SoftAssert();
	for(WebElement link:links) {
		String url = link.getAttribute("href");
		HttpURLConnection  conn= (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
        conn.connect();
        int responseCode = conn.getResponseCode();
        System.out.println(responseCode);
    a.assertTrue(responseCode<400, "This URL with text "+ link.getText()+ " is broken link with status code: "+ responseCode);
	}
	a.assertAll();
}
}
