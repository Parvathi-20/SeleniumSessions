package seleniumTopics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {

		ElementUtil eu = new ElementUtil(driver);
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

//		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
//		System.out.println("Total number of images " + imagesList.size());
//		
//		for(WebElement e : imagesList) {
//			String altVal = e.getAttribute("alt");
//			System.out.println(altVal);
//		}

		By image = By.tagName("img");
		By links = By.linkText("a");

		int imagesCount = eu.getElementsCount(links);
		if (imagesCount > 200) {
			System.out.println("links are more than 200");
		} else {
			System.out.println("there are only " + imagesCount + " imgaes ..");
		}

//		getElementAtributeValues(image,"alt");
//		getElementAtributeValues(links,"href");

		List<String> imagesAttrList = eu.getElementAtributeValues(image, "alt");
		if (imagesAttrList.contains("Baskets & hampers")) {
			System.out.println("pass");
		}
	}

}
