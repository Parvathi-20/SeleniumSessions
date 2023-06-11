package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
//		/never use AutoIT -- is only for windows machine -- it wont work on remote machine/mac/linux/docker/cloud
		//Robot class --> only for windows
		//Sikuli lib: image based 
		
		//sendKeys --> file path
		//<type = file>
		
		String path = "C:\\Users\\lenovo\\Downloads\\testpdfupload.pdf";
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
//
//		driver.findElement(By.name("upfile")).sendKeys(path)	;
		
		
		//type = file --> if its not there -- you cant use sendKeys
		//ask the dev team to add this attribute
		
		driver.get("https://tiiny.host/?content=pdf");
		driver.findElement(By.xpath("//*[@id='content-selector-tabpane-pdf']/div/div/input")).sendKeys(path);
		
//		driver.switchTo().alert().accept();
	
		
		
	}

}
