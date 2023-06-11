package seleniumTopics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		
		Dimension dim = new Dimension(500,500);
		
		dr.manage().window().setSize(dim);
		dr.get("https://www.amazon.com");
		
		dr.quit();
		
	}

}
