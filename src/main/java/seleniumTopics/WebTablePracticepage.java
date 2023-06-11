package seleniumTopics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePracticepage {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(3000);
		
		selectContact("Ali Khan");
//		
		
		List<String> KishoreContactDetails = getCOntactDetails("Kishore Venkat");
		System.out.println(KishoreContactDetails);
		
	}

	public static void selectContact(String contactName) {
		driver.findElement(By.xpath("//a[text()='"+contactName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static List<String> getCOntactDetails(String contactName) {
		List<WebElement> contactDetailsElements = driver.findElements(By.xpath("//a[text()='"+contactName+"']/parent::td/following-sibling::td"));
	List<String> contactDetails = new ArrayList<String>();
		for(WebElement e:contactDetailsElements ) {
			String text = e.getText();
			contactDetails.add(text);
		}
		return contactDetails;
		
	}

}
