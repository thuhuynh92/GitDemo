
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
	
	String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
	addItems(driver, itemsNeeded);
	driver.findElement(By.cssSelector("a.cart-icon")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();
	driver.findElement(By.xpath("//button[text()='Place Order']")).click();
}

public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException {
	int j = 0;
	Thread.sleep(3000);
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i = 0; i<products.size(); i++) {
			List itemsNeededList = Arrays.asList(itemsNeeded);
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
		
			if(itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
				
				if(j== itemsNeeded.length) {
					break;}
				}
		}
}
}
