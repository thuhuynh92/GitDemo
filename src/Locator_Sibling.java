import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Sibling {
public static void main(String[] args) {
System.setProperty("webDriverPath","C:\\Users\\Anh Thu\\chromdriver.exe" );
WebDriver driver = new ChromeDriver();
driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());


	
}
}
