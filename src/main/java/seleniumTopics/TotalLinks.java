package seleniumTopics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		// find out all the links on the page
		// count of links
		// link --> htnml tag -- <a>
		// FEs -- multiple elements
		// print the text of each link?
		// skip the blank text

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		/*
		 * List<WebElement> totallinks = driver.findElements(By.tagName("a")); int t =
		 * totallinks.size(); System.out.println("total no of links is " + t);
		 * 
		 * for(int i = 0; i < t; i++) { String text = totallinks.get(i).getText();
		 * if(text.length()>0) { System.out.println(i + " " +text); } }
		 * 
		 * 
		 * int count = 0; for(WebElement e:totallinks) { String text = e.getText();
		 * if(text.length()>0) { System.out.println(count + " " +text); } count ++; }
		 */

		
//		total images:
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("total images on pages - " + images.size());
		List<String> altVAlues = new ArrayList<String>();
		List<String> srcvalues = new ArrayList<String>();

		for (WebElement e : images) {
			String altVal = e.getAttribute("alt");
			String srcVal = e.getAttribute("src");
			altVAlues.add(altVal);
			srcvalues.add(srcVal);

//			System.out.println(altVal);
//			System.out.println(srcVal);


		}

//		System.out.println("altvalues " + altVAlues);
		System.out.println( srcvalues);

	/*
		
		
		By image = By.tagName("img");
		By links = By.tagName("a");
		
		getEleAttributeVal(image,"src");
		getEleAttributeVal(links,"href");

		*/
	}
	
		

	public static void getEleAttributeVal(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList) {
			String attrVal = e.getAttribute(attrName);
//			System.out.println(attrVal);
			
		}
	}
	
	public static int getTotalElements(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
