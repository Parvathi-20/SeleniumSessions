package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathPracticenew {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.practo.com/bangalore/doctors");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[text()='Dr. K.A. Mohan']/ancestor::div[@class='listing-doctor-card']//button[@data-qa-id='book_button']")).click();
	
		driver.manage().window().fullscreen();
//		document.querySelector("input[placeholder='Enter Last name']").removeAttribute('disabled')
//		document.querySelector("input[placeholder='Enter Last name']").value='naveen'
	}

}
