package UI;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class windowhandles {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"announcement-banner\"]/div/div/div/h4/a")).click();
		driver.getWindowHandles();
		Set<String> WindowHandles = driver.getWindowHandles();
		System.out.println(WindowHandles);
		Iterator<String> iterator = WindowHandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		driver.switchTo().window(childwindow);
		//driver.findElement(By.id("search")).click();
	//	driver.findElement(By.id("search")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id=\"thumbnail\"]/yt-image/img")).click();
		
		
		
	

}
}
