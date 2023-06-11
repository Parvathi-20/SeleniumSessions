package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class SeleniumManagerConcept {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");


		WebDriver driver = new ChromeDriver(options);
		driver.get("https://google.com");
		
		String cpath = SeleniumManager.getInstance().getDriverPath(options);
		System.out.println(cpath);
		
		driver.quit();
	}
	
	
}
