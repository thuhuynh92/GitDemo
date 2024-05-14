import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class RelativeLocators {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	WebElement editBox = driver.findElement(By.cssSelector("input.form-control[name='name']"));
	System.out.println(driver.findElement(with(By.tagName("label")).above(editBox)).getText());
	WebElement dateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
	driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
	WebElement iceCreams = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
	driver.findElement(with(By.tagName("input")).toLeftOf(iceCreams)).click();
	WebElement radioBtn = driver.findElement(By.id("inlineRadio1"));
	System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioBtn)).getText());
}
}
