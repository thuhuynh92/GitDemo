import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class FilterHandle {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anh Thu\\chromedriver.exe");
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	


	
	String text = "apple";
	List<String> filter;
	WebElement nextBtn;
	String status;

//	do {
//	    List<WebElement> originalList = driver.findElements(By.xpath("//tr/td[1]"));
//	    List<WebElement> filteredList = originalList.stream()
//	            .filter(s -> s.getText().toLowerCase().contains("o"))
//	            .collect(Collectors.toList());
//
//	    filter = filteredList.stream()
//	            .map(WebElement::getText)
//	            .collect(Collectors.toList());
//
//	    nextBtn = driver.findElement(By.cssSelector("a[aria-label='Next']"));
//	    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//	    wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
//	    nextBtn.click();
//	    status = nextBtn.getAttribute("aria-disabled"); 
//	    System.out.println(status);
//
//	}
//	while(status != "false");
	List<String> mergedList = new ArrayList();
	do{
		List<WebElement> originalList = driver.findElements(By.xpath("//tr/td[1]"));
		 List<WebElement> filteredList = originalList.stream()
	            .filter(s -> s.getText().toLowerCase().contains(text))
	            .collect(Collectors.toList());
		   filter = filteredList.stream().map(a->a.getText()).collect(Collectors.toList());
	nextBtn = driver.findElement(By.cssSelector("a[aria-label='Next']"));
	status = nextBtn.getAttribute("aria-disabled");
	Thread.sleep(3000);
	
	mergedList.addAll(filter);
	System.out.println(mergedList);
	if(status.contains("false")) {
		driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		
				
	}

	}while(status.contains("false"));
	System.out.println(filter);
	driver.findElement(By.id("search-field")).sendKeys(text);
	List<WebElement> searchResult = driver.findElements(By.xpath("//tr/td[1]"));
	List<String> result = searchResult.stream().map(r->r.getText()).collect(Collectors.toList());
	
	Assert.assertEquals(filter, result);
}	
			
	

	//System.out.println(filter);


	 // Printing filter list outside the loop

//	driver.findElement(By.id("search-field")).sendKeys("apple");
//	List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
//	List<String> l = list.stream().map(a->a.getText()).collect(Collectors.toList());
	
//	System.out.println(l);
//	
//	Assert.assertEquals(filter, l);
	
	
}
