package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resize {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		
		driver.switchTo().frame(frame);
		WebElement resize = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 100, 70).perform();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
