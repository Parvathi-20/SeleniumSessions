package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverLaunch {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();

		driver.get("https://google.com");
		driver1.get("https://amazon.com");
		
//		for multiple user roles - admin,user
//		two chat windows
		
		
		
		driver = driver1;
		
		System.out.println(driver.getTitle());

	}

}
