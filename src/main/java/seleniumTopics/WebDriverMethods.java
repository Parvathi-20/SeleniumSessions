package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
//		WebDriver  driver1 = new ChromeDriver(options);

//		driver.get("https://www.google.com");
//		driver1.get("https://www.amazon.com");
//		
////		admin
//		//user
//		
//		driver = driver1;
//		
//		System.out.println(driver.getTitle());
		
		driver.get("https://classic.crmpro.com/");
		
//		String pageSource = driver.getPageSource();
////		System.out.println(pageSource);
//		
//		System.out.println(pageSource.contains("Tracking tasks, issues, and sales give you complete visibility"));
//		
//		
		
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		
		Thread.sleep(500);
		driver.quit();
		
	}
	

	
}
