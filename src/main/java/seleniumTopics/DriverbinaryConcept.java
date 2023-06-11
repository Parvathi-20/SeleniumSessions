package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverbinaryConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

		System.out.println(driver.getTitle());

		driver.quit();//background process will be killed
		driver.close();//background process will not be closed and can be closed from task manager

	}

}
