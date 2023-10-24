package UI;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class windowhandlesex {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.canada.ca/en/services/immigration-citizenship.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/section[1]/div/div/div[2]/ul/li[1]/a")).click();
		driver.getWindowHandles();
		
		Set<String>WindowHandles =driver.getWindowHandles();
		System.out.println(WindowHandles);
		Iterator<String>Iterator = WindowHandles.iterator();
		
		String parentwindow = Iterator.next();
		String childwindow = Iterator.next();
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//*[@id=\"wb-auto-16\"]/div/div/details/summary  sss")).click();
		
		
		// TODO Auto-generated method stub

	}

}
