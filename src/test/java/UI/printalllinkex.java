package UI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class printalllinkex {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		driver.findElements(By.tagName("a"));
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println("Total tags are:" +alltags.size());
		
		for (int i=0;i<alltags.size();i++);
		{
			System.out.println("links on page are "+alltags.get(0).getAttribute("href"));
			System.out.println("links on page are "+alltags.get(0).getText());
			
			
			
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
