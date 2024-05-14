import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxExercise {

	

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
	driver.findElement(By.id("checkBoxOption1")).click();
	Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
	Assert.assertFalse(driver.findElement(By.id("checkBoxOption2")).isSelected());
	driver.findElement(By.id("checkBoxOption2")).click();
	Assert.assertTrue(driver.findElement(By.id("checkBoxOption2")).isSelected());
	Assert.assertFalse(driver.findElement(By.id("checkBoxOption3")).isSelected());
	driver.findElement(By.id("checkBoxOption3")).click();
	Assert.assertTrue(driver.findElement(By.id("checkBoxOption3")).isSelected());
	
	Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),3);
	
	}

}
