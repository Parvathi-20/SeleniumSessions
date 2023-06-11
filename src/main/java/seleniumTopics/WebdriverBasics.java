package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebdriverBasics {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");

//		ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.codingame.com/start");

		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);

		if (PageTitle.contains("Games")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		System.out.println(driver.getCurrentUrl());

		driver.close();
		
		//Automation Steps + verification point = automation testing
		
				//driver.quit();//close the browser
				//driver.close();//close the browser

	}
}
