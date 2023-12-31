package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleSelectMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");

		By state = By.id("multi-select");
		WebElement statele = driver.findElement(state);

		By week = By.id("select-demo");
		WebElement weekele = driver.findElement(week);

		Select select1 = new Select(statele);
		System.out.println(select1.isMultiple());

		Select select2 = new Select(weekele);
		System.out.println(select2.isMultiple());

		select1.selectByVisibleText("Florida");
		select1.selectByVisibleText("Washington");

		List<WebElement> allStateSelectedlist = select1.getAllSelectedOptions();
		for (WebElement e : allStateSelectedlist) {
			String text = e.getText();
			System.out.println( text);
		}
		String firstOtpion = select1.getFirstSelectedOption().getText();
		System.out.println(firstOtpion);
		
		select1.deselectByValue("Florida");
		select1.deselectAll();		
	}

}
