package seleniumTopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// JS pop ups: Alert Interface
		// 1. Alert
		// 2. confirm
		// 3. prompt
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		Thread.sleep(2000);

		Alert alertConfirm = driver.switchTo().alert();
		String Confirmtext = alert.getText();
		System.out.println(Confirmtext);
		alertConfirm.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		Thread.sleep(2000);

		Alert alertPrompt1 = driver.switchTo().alert();
		String textPrompt1 = alert.getText();
		System.out.println(textPrompt1);
		alertPrompt1.sendKeys("TestAutomation");
		alertPrompt1.accept();

	}

}
