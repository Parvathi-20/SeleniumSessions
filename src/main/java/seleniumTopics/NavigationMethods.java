package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	
	public static void main(String[] args) {
		
		//back and forward button simulation
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
		
	}

}
