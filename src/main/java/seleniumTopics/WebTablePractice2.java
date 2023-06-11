package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/table_sorting.html");
		
		
		WebElement  sal = driver.findElement(By.xpath("(//td[contains(text(),'Olivia Liang')]/following-sibling::td)[last()]"));
	
		String Oliviasalary = sal.getText();
		System.out.println(Oliviasalary);
		
		String newSal = Oliviasalary.replace("$","");
		String Salary = newSal.replace(",","");
//		System.out.println(Salary);
		
		int Salary_olivia = Integer.parseInt(Salary);
		if(Salary_olivia > 200000) {
			System.out.println(Oliviasalary + "Salary is higher than 2Lac" );
		}else {
			System.out.println(Oliviasalary + "Salary is less than 2Lac");
		}
		
		
		
	
	}

}
