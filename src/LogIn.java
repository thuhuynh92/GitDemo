import java.time.Duration;

import org.checkerframework.dataflow.qual.AssertMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LogIn {
public static void main(String[] args) throws InterruptedException {
	String name = "ThuHuynh";
	
	WebDriver driver = new ChromeDriver();
	String password = getPassword(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("anhthu");
	driver.findElement(By.name("inputPassword")).sendKeys("password");
	driver.findElement(By.cssSelector("button.signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Thu");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("email");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("aaaaa");
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("phone");
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
	driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys(password);
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#chkboxOne")).click();
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	Thread.sleep(1000);
	Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
	Thread.sleep(1000);
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	driver.findElement(By.xpath("//[text()='Log Out']")).click();
	driver.close();
	
}

public static String getPassword(WebDriver driver) throws InterruptedException{
	driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	String passwordText = (driver.findElement(By.cssSelector(".infoMsg")).getText());
	String[] passwordArray = passwordText.split("'");
	String password = passwordArray[1].split("'")[0];
	return password;
	
}
}