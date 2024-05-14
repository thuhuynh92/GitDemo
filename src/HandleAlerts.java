import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleAlerts {
public static void main(String[] args) throws InterruptedException {
	String text = "Anh Thu";
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("name")).sendKeys(text);
	driver.findElement(By.id("alertbtn")).click();
	Thread.sleep(2000);

	Assert.assertEquals(driver.switchTo().alert().getText(), ("Hello " + text + ", "+ "share this practice page and share your knowledge"));
	driver.switchTo().alert().accept();
	driver.findElement(By.id("name")).sendKeys(text);
	driver.findElement(By.id("confirmbtn")).click();
	Thread.sleep(2000);
	Assert.assertEquals(driver.switchTo().alert().getText(), ("Hello " + text + ", "+ "Are you sure you want to confirm?"));
	driver.switchTo().alert().accept();
	driver.findElement(By.id("name")).sendKeys(text);
	driver.findElement(By.id("confirmbtn")).click();
	Thread.sleep(2000);
	Assert.assertEquals(driver.switchTo().alert().getText(), ("Hello " + text + ", "+ "Are you sure you want to confirm?"));
	driver.switchTo().alert().dismiss();
	
	
	
}
}
