package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboard {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		WebElement boxa = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[1]/pre/span"));
		WebElement boxb = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[2]/pre"));
		Actions action = new Actions(driver);
		action.keyDown(boxa,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		action.keyDown(boxb,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
