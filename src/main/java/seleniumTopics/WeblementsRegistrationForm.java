package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeblementsRegistrationForm {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil bu = new BrowserUtil();
		WebDriver driver = bu.initDriver("chrome");
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By Fname = By.id("input-firstname");
		By Lname = By.id("input-lastname");
		By email = By.id("input-email");
		By phnoe = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmpwd = By.id("input-confirm");

		ElementUtil eu = new ElementUtil(driver);
		eu.doSendkeys(Fname, "testname",false);
		Thread.sleep(500);
		eu.doSendkeys(Fname, "123",true);
		Thread.sleep(500);
		eu.doSendkeys(Fname, "testname123",true);
		Thread.sleep(500);
		eu.doSendkeys(Fname, "Parvathi",true);
		eu.doSendkeys(Lname, "Mesta");
		eu.doSendkeys(email, "mesta.parvathi@gmail.com");
		eu.doSendkeys(phnoe, "9599787896");
		eu.doSendkeys(password, "parvathi123");
		eu.doSendkeys(confirmpwd, "parvathi123");
	
		bu.quitBrowser();
	}

}
