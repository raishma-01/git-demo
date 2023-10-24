package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class loginui5 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.bell.ca/");
		driver.findElement(By.id("USER")).sendKeys("standard-user");
		driver.findElement(By.id("PASSWORD")).sendKeys("secret-sauce");
		driver.findElement(By.id("labelLogin")).click();
		driver.close();

}

}
