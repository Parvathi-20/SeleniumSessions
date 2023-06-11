package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		System.out.println(flag);

		By search = By.id("twotabsearchtextbox");

		ElementUtil eu = new ElementUtil(driver);
		boolean Displayflag = eu.checkElementIsDisplayed(search);
		if (Displayflag) {
			eu.doSendkeys(search, "macbook");
		}else {
			System.out.println("search is not present");
			
		}
		

	}

}
