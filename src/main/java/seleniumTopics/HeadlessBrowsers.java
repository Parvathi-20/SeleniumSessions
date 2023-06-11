package seleniumTopics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowsers {

	public static void main(String[] args) {
//headless - testing happening behind the scne
//		hence its faster
//		can be helpful in linux machine
//		can be used in ci/cd - pipeline  - jenkins, github,aws
//		might not work for internal navigations, complex html apps, mouse hover etc

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		co.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(co);

//		FirefoxOptions fo = new FirefoxOptions();
////		fo.addArguments("--headless");
//		fo.addArguments("--incognito");
//		WebDriver driver = new FirefoxDriver(fo);

		driver.get("https://google.com");

		System.out.println(driver.getTitle());

		driver.quit();

	}

}
