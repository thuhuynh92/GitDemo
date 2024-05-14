import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/angularpractice/");
	driver.findElement(By.cssSelector("input[class*='ng-invalid'][name='name']")).sendKeys("Anh Thu");
	driver.findElement(By.cssSelector("input[class*='ng-invalid'][name='email']")).sendKeys("anhthu@email.com");
	driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
	driver.findElement(By.id("exampleCheck1")).click();
	Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());
	WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
	Select dropdown = new Select(staticDropdown);
	dropdown.selectByIndex(0);
	//Assert.assertEquals(driver.findElement(By.id("exampleFormControlSelect1")).getText(), "Male");
	driver.findElement(By.id("inlineRadio1")).click();
	Assert.assertTrue(driver.findElement(By.id("inlineRadio1")).isSelected());
	driver.findElement(By.id("inlineRadio2")).click();
	Assert.assertTrue(driver.findElement(By.id("inlineRadio2")).isSelected());
	Assert.assertFalse(driver.findElement(By.id("inlineRadio1")).isSelected());
	Assert.assertFalse(driver.findElement(By.id("inlineRadio3")).isEnabled());
	driver.findElement(By.name("bday")).sendKeys("04/04/1992");
	driver.findElement(By.cssSelector(".btn-success")).click();
	Assert.assertEquals(driver.findElement(By.cssSelector(".alert-dismissible")).getText(),"x Success! The Form has been submitted successfully!.");
	
	
//	driver.get("https://rahulshettyacademy.com/angularpractice/");
//
//	driver.findElement(By.name("name")).sendKeys("rahul");
//
//	driver.findElement(By.name("email")).sendKeys("hello@abc.com");
//
//	driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
//
//	driver.findElement(By.id("exampleCheck1")).click();
//
//	WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
//
//	Select abc = new Select(dropdown);
//
//	abc.selectByVisibleText("Female");
//
//	driver.findElement(By.id("inlineRadio1")).click();
//
//	driver.findElement(By.name("bday")).sendKeys("02/02/1992");
//
//	driver.findElement(By.cssSelector(".btn-success")).click();
//
//	System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());




}
}
