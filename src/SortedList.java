import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortedList {
public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.findElement(By.xpath("//tr/th[1]")).click();
	List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
	List<String> OriginalList= elementList.stream().map(s ->s.getText()).collect(Collectors.toList());
	List <String> sortedList = OriginalList.stream().sorted().collect(Collectors.toList());
	Assert.assertEquals(OriginalList, sortedList);
	
	List<String> price;
	do{
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		price = rows.stream().filter(s->s.getText().contains("Rice"))
	
			.map(s->getPriceVeggie(s)).collect(Collectors.toList());
	price.forEach(c->System.out.println(c));
	if(price.size()<1) {
		driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
	}

	}while(price.size()<1);
}

private static String getPriceVeggie(WebElement s) {
	String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
	return priceValue;
}
}
