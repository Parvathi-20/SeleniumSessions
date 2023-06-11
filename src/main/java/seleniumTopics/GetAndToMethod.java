package seleniumTopics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndToMethod {

	public static void main(String[] args) {

		// Difference between get and to method

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

//		driver.navigate().to("https://www.amzon.com");

//		driver.get("https://www.amzon.com");

		try {
			driver.navigate().to(new URL("https://www.amazon.com"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().back();
		driver.quit();

		
	
	}

}
