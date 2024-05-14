import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PracticeAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String lable = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(lable);
		driver.findElement(By.id("dropdown-class-example")).click();
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText(lable);
		driver.findElement(By.id("name")).sendKeys(lable);
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		
		Assert.assertEquals(alert.getText(),"Hello "+lable+", share this practice page and share your knowledge");
		if(text.contains(lable)) {
			System.out.println("success");
		}else {System.out.println("something wrong with the execution");
	}}}