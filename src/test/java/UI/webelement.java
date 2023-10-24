package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class webelement {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.name("url"));
		Select select = new Select(dropdown);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.deselectByValue("search-alias=aps");
		Thread.sleep(2000);
		select.deselectByVisibleText("Alexa Skills");
		
		// TODO Auto-generated method stub

	}

}
