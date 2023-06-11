package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooter {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.com");

//		List<WebElement> footerList = driver.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']//td/a"));

		
		List<WebElement> footerList = driver.findElements(By.xpath("//div[contains(@class,'navFooterLinkCol')]//li"));
		System.out.println("Total footers " + footerList.size());
		for (WebElement e : footerList) {
			String text = e.getText();
			System.out.println(text);
		}

	}

}
