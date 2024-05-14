import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	System.out.println(driver.findElements(By.tagName("a")).size());
	WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	WebElement footerdriver1 = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(footerdriver1.findElements(By.tagName("a")).size());
	Thread.sleep(3000);
	
	for(int i=1; i<footerdriver1.findElements(By.tagName("a")).size();i++)
	{
		String clickonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
		footerdriver1.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
	}
	
	Thread.sleep(5000);
	Set<String> abc = driver.getWindowHandles();
	Iterator<String> it = abc.iterator();
	while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	}
}
