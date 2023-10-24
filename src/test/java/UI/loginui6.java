package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginui6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.aircanada.com/");
		driver.findElement(By.id("LOGINID_1311311543682226_LABEL")).sendKeys("standard-user");
		driver.findElement(By.id("PASSWORD_132128826476804690_LABEL")).sendKeys("secret-sauce");
		driver.findElement(By.id("submit")).click();
		driver.close();
		
		
		// TODO Auto-generated method stub

	}
}



