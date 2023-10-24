package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginui {
	

	
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();  
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.id("First and last name")).sendKeys("standard-user");
		driver.findElement(By.id("ap_password")).sendKeys("secret-sauce");
		driver.findElement(By.id("submit")).click();
		driver.close();
				
				      
			     
			

		
		// TODO Auto-generated method stub

	}
}

