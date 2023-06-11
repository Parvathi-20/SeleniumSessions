package seleniumTopics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutSelectMethods {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("acceptInsecureCerts");
		driver = new ChromeDriver(options);
		driver.get("https://ainurpos.com/partnership/");

		By country = By.id("form-field-country");
		By countryPhCode = By.id("form-field-field_7edda11");
//
//		int actCount = getDropDownValueCount(country);
//		if (actCount == 234) {
//			System.out.println("count is matching..");
//		}

//		System.out.println(getAllDropDownOptions(country));

//		List<String> countryList = getAllDropDownOptions(country);
//		System.out.println(countryList.contains("India"));
//		System.out.println(countryList.contains("Pakistan"));

		doSelectDropDownValue(country, "Guinea Bissau");
		Thread.sleep(500);
		System.out.println(doSelectDropDownValue(countryPhCode, "India"));

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static int getDropDownValueCount(By locator) {
		return getAllDropDownOptions(locator).size();
	}

	public static List<String> getAllDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsValueList = new ArrayList<String>();

		System.out.println("Total values " + optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			optionsValueList.add(text);
		}
		return optionsValueList;
	}

	public static boolean doSelectDropDownValue(By locator, String dropdwonvalue) {
		boolean flag = false;
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();

		System.out.println("Total values " + optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(dropdwonvalue)) {
				flag = true;
				e.click();
				break;
			}

		}
		if (flag == false) {
			System.out.println(dropdwonvalue + "value is not present in the " + locator);
		}
		return flag;

	}
}
