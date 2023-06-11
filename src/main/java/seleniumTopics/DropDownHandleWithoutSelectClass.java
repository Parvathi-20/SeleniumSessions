package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDownHandleWithoutSelectClass {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("acceptInsecureCerts");
		driver = new ChromeDriver(options);
//		driver.get("https://ainurpos.com/partnership/");
//		By country = By.xpath("//select[@id='form-field-country']/option");
		
		driver.get("https://spiceclub.spicejet.com/signup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'selected-flag')]//div[@class='arrow']")).click();
		Thread.sleep(2000);
		By country = By.xpath("//ul[@class=' country-list']//span[last()-(last()-1)]");

		DoSelectValueFromDropDownWithoutSelect(country, "Andorra");
	}
	
	public static boolean DoSelectValueFromDropDownWithoutSelect(By locator, String dropdownval) {
		boolean flag= false;
		List<WebElement> otpionsList = driver.findElements(locator);
		for(WebElement e : otpionsList) {
			String text = e.getText();
			if(text.equals(dropdownval)) {
				e.click();
				flag= true;
				break;
			}
		}
		
		if (flag == false) {
			System.out.println(dropdownval + "not present in dropdwon ");
		}
		return flag;
		
	}

}
