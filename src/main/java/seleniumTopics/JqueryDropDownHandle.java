package seleniumTopics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);

		By choices = By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//span[@class='comboTreeItemTitle']");

//		// TC1 : single selection
//		selectChoice(choices, "choice 6");
//
//		// TC2 : Multi selection
//		selectChoice(choices, "choice 2", "choice 6");

		// Tc3: All selection
		selectChoice(choices, "all");
		deselectChoice(choices, "all");

		// tc4 : no selection
//		selectChoice(choices, "choice 9", "choice 1", "choice 8");
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	// vararg
		public static void selectChoice(By locator, String... value) {
			List<WebElement> optionsList = getElements(locator);
			System.out.println(optionsList.size());
			boolean flag = false;

			if (!value[0].equalsIgnoreCase("all")) {
				for (WebElement e : optionsList) {
					String text = e.getText();
					System.out.println(text);

					// multiple selection logic:
					for (int i = 0; i < value.length; i++) {
						if (text.equals(value[i])) {
							flag = true;
							e.click();
							break;
						}
					}

				}
			}
			else {
				//all selection logic:
				for(WebElement e : optionsList) {
					String text = e.getText();
						if(!text.equals("−")) {
							e.click();
							flag = true;
						}
				}
				
			}
			
			if(flag==false) {
				System.out.println("choice is not available");
			}
		}
		
		
//		//div[@class='KxwPGc AghGtd']/a -- 4 --List<WE> - l1
//		//div[@class='KxwPGc iTjxkf']/a --2 --l2 
//		footer = l1+l2;
		
		//div[@class='KxwPGc SSwjIe']/div/a -- 6
		//a[@class='pHiOh'] -- 6
		
		////*[contains(@class,'pHiOh')]  -- 7
		
	public static void deselectChoice(By locator, String... deselectvalue) {
		
		List<WebElement> optionsList = getElements(locator);
		if (!deselectvalue[0].equalsIgnoreCase("all")) {}else {
			for(WebElement e :optionsList ) {
				e.click();
			}
		}
		
	}
	
}
