package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {

	public static void main(String[] args) {

		String uname= "admin";
		String pwd = "admin";
		
		String urltouse = "https://"+uname+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth";
		System.out.println(urltouse);
		WebDriver driver =new ChromeDriver();
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get(urltouse);

		
	}

}
