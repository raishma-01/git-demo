package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class webelementdropdown {

	public static void main(String[] args) 
		throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.className("ui fluid dropdown selection multiple active visible"));
		Select select = new Select(dropdown);
		select.selectByIndex(0);
		select.selectByIndex(2);
		select.deselectAll();
		
		
		// TODO Auto-generated method stub

	}
	
}
