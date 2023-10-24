package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class loginui7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.canadiantire.ca/");
		driver.findElement(By.id("gigya-label")).sendKeys("standard-user");
		driver.findElement(By.id("gigya-label")).sendKeys("secret-sauce");
		driver.findElement(By.id("submit")).click();
		driver.close();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
