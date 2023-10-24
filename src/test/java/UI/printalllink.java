package UI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printalllink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/?utm_source=google.com&utm_medium=organic");
		driver.manage().window().maximize();
		
		List<WebElement>  alllinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links are : "+alllinks.size());
		
		for(int i=0;i<alllinks.size();i++);
		{
			System.out.println("links on the page are"+alllinks.get(0).getAttribute("href"));
			System.out.println("links on the page are"+alllinks.get(0).getText());
			
			
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
