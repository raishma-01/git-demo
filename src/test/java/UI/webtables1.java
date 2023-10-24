package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtables1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//no of rows
		List<WebElement> rowelements = driver.findElements
				(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		int rowsize = rowelements.size();
		System.out.println(rowelements.size());
		
		//no of columns
		List<WebElement>columnelements = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td"));
		int columnsize = columnelements.size();
		System.out.println(columnelements.size());
		
		for(int i=1;i<=rowsize;i++) {
			for(int j=1;j<=columnsize;j++) {
		
			driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[1]"));
			
			
			System.out.print(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText() + "  ");
		System.out.println();
		
		
		// TODO Auto-generated method stub

	}
		}
	}
}



