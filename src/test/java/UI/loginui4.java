package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginui4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.lowes.ca/");
		driver.findElement(By.id("Email Address")).sendKeys("standard-user");
		driver.findElement(By.id("password")).sendKeys("secret-sauce");
		driver.findElement(By.id("submit")).click();
		driver.close();

}
}
