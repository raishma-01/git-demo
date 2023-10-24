package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginui3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.zara.com/ca/");
		driver.findElement(By.id("logonId")).sendKeys("standard-user");
		driver.findElement(By.id("password")).sendKeys("secret-sauce");
		driver.findElement(By.id("LOG IN")).click();
		driver.close();
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
