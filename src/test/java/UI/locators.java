package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class locators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		//driver.get("https://www.saucedemo.com/v1/");
		
		//driver.findElement(By.className("form_input")).sendKeys("testing");
		//driver.findElement(By.cssSelector("#login-button")).click();
		//driver.findElement(By.name("password")).sendKeys("testing");
		//driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		driver.get("https://www.selenium.dev/");
		//driver.findElement(By.linkText("Watch the videos")).click();
		//driver.findElement(By.partialLinkText("Videos")).click();
		driver.findElement(By.tagName("Layer_1")).click();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
