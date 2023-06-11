package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gsttest {
	static WebDriver driver;

	public static void getBrowser(String browsername, String URL) {
		System.out.println("Selected browser is " + browsername);

		switch (browsername.toLowerCase().trim()) {
		case ("chrome"):
			driver = new ChromeDriver();
			driver.get(URL);
			break;

		case ("firefox"):
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("pls pass the right Browser");
		}
	}

	public static void main(String[] args) {
		gsttest.getBrowser("chrome", "https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']"))
		.sendKeys("mysoorian kathegulu");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.quit();

	}

}
