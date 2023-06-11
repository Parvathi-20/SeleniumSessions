package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandleConcept {

	public static void main(String[] args) {

		String path = "C:\\Users\\lenovo\\Downloads\\Capture.PNG";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.cssSelector("#RESULT_TextField-1")).sendKeys("TestForm");
		driver.findElement(By.cssSelector("#RESULT_TextField-3")).sendKeys("Bangalore");
		driver.findElement(By.cssSelector("#RESULT_TextField-4")).sendKeys("23-01-01");
		driver.findElement(By.cssSelector("#RESULT_TextArea-5")).sendKeys("Test Description");
		
		driver.findElement(By.cssSelector("#RESULT_FileUpload-6")).sendKeys(path);
	}

}
