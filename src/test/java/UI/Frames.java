package UI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		
		driver.switchTo().alert().sendKeys("Raishma");
		driver.switchTo().alert().accept();
		
		
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
		
		// TODO Auto-generated method stub

	}

}
