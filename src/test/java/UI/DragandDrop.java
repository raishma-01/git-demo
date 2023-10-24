package UI;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DragandDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
	WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		
		
		driver.switchTo().frame(frame);
		Actions actions = new  Actions(driver); //creating object to call method
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		
	actions.dragAndDrop(drag,drop).perform();
	
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
