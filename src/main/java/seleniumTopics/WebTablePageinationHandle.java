package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePageinationHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);

		/*
		 * while (true) { if
		 * (driver.findElements(By.xpath("//td[text()='Srilanka']")).size() > 0) {
		 * selectCountry("Srilanka"); break; } else {
		 * 
		 * WebElement next = driver.findElement(By.linkText("Next")); if
		 * (next.getAttribute("class").contains("disabled")) {
		 * System.out.println("Pagination ends, country not found.."); break; }
		 * next.click(); Thread.sleep(1500);
		 * 
		 * } }
		 */
		
		do {
			List<WebElement> countryList = driver.findElements(By.xpath("//td[text()='Srilanka']"));
			if(countryList.size() > 0) {
				selectCountry("Srilanka");
				break;
			}
		} while (true);

	}

	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}
	
	
	
	

}





