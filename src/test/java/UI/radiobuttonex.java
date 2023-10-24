package UI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class radiobuttonex {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.singaporeair.com/en_UK/ca/home#/book/bookflight");
		driver.manage().window().maximize();
		 driver.findElement(By.id("bookFlights"));
		 driver.findElement(By.id("redeemFlights")).click();

	
		System.out.println(driver.findElement(By.id("bookFlights")).isSelected());
		System.out.println(driver.findElement(By.id("redeemFlights")).isSelected());
		
		// TODO Auto-generated method stub

	}

}
