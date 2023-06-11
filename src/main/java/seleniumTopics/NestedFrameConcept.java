package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameConcept {

	public static void main(String[] args) {
//		/Nested iframes/frames
		// Browser
		// Page -- elements
		// iframe1 -- elements
		// iframe2 -- elements
		// iframe3 -- elements

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");

		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("Tom");

		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Peter");

		driver.switchTo().frame("pact3"); // driver -- pact 3
		driver.findElement(By.id("glaf")).sendKeys("Naveen");

//		//switching back to step back frame  -->> use parentframe
//		
//		driver.switchTo().parentFrame(); //driver -- pact 3
//		driver.findElement(By.id("jex")).clear();;
//		driver.findElement(By.id("jex")).sendKeys("Riya");

		// pact 3 to pact1
		driver.switchTo().parentFrame(); // pact 2
		driver.switchTo().parentFrame();// pact 1
		driver.findElement(By.id("inp_val")).clear();
		;
		driver.findElement(By.id("inp_val")).sendKeys("Riya");

		// driver is on pact1 ---> main page (default content)

		driver.switchTo().defaultContent();

		String header = driver.findElement(By.cssSelector("h1.elementor-heading-title.elementor-size-default"))
				.getText();
		System.out.println(header);
		
		//page to frame
				//f1 to f2
				//f2 to f3
				//f3 to f2
				//f2 to f1
				//f1 to f3 -- NO
				//f1 to f2  to f3 -- yes
				//f3 to default content ---> page
				//page --> f1 -> f2
				//f2 to main page --> yes with default content
				//page --> f3 -- NO
				//Page --> f2 --> NO
				//Page --> f1 --> f2 --> f3 ---> yes
//		driver.switchTo()
//		.frame("pact1")
//				.switchTo().frame("pact2")
//						.switchTo().frame("pact3")
//								.findElement(By.id("glaf")).sendKeys("Riya");




//driver.switchTo()
//.frame("pact1")
//		.switchTo().frame("pact2")
//						.findElement(By.id("jex")).sendKeys("Ankit");
		
		
		driver.switchTo()
		.frame("pact1")
				.switchTo().frame("pact2")
						.switchTo().frame("pact3")
								.findElement(By.id("glaf")).sendKeys("Riya");
								
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("Ankit");;

	}

}
