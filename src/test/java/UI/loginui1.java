package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginui1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.walmart.ca/");
		driver.findElement(By.id("Email address or phone number")).sendKeys("standard-user");
		driver.findElement(By.id("password")).sendKeys("secret-sause");
		driver.findElement(By.id("Sign in")).click();
		driver.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
