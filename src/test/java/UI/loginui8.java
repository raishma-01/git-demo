package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class loginui8 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.bestbuy.com/");
		driver.findElement(By.id("email")).sendKeys("standard-user");
		driver.findElement(By.id("password")).sendKeys("secret-sauce");
		driver.findElement(By.id("Sign In")).click();
		driver.close();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
