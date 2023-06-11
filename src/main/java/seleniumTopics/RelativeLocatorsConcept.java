package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;;

public class RelativeLocatorsConcept {

	public static void main(String[] args) {
		// above
		// left<---ele --> right
		// below
		// near -- 100 px
		// Sel 4.x

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");

		WebElement e = driver.findElement(By.linkText("Red Deer, Canada"));

		// right of ele

		String rightScore = driver.findElement(with(By.tagName("p")).toRightOf(e)).getText();
		System.out.println(rightScore);

		// left of ele

		String leftIndex = driver.findElement(with(By.tagName("p")).toLeftOf(e)).getText();
		System.out.println(leftIndex);

		// below of ele

		String belowCity = driver.findElement(with(By.tagName("p")).below(e)).getText();
		System.out.println(belowCity);

		// above of ele

		String aboveCity = driver.findElement(with(By.tagName("p")).above(e)).getText();
		System.out.println(aboveCity);
		
		// near of ele

		String nearCity = driver.findElement(with(By.tagName("p")).near(e)).getText();
		System.out.println(nearCity);

	}

}
