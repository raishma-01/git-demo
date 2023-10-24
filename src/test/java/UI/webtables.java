package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://trends.builtwith.com/websitelist/Responsive-Tables");
		driver.manage().window().maximize();
		
		//step 1  get the no of rows
		List<WebElement> rowelements = driver.findElements(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody/tr"));
	 int rowsize= 	rowelements.size();
	 System.out.println(rowelements.size());
	 
	 //step 2 get the no of columns
	 List<WebElement> columnelements = driver.findElements(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody/tr[1]/td"));
	 int columnsize= columnelements.size();
	 System.out.println(columnelements.size());
	 
	 for(int i=1;i<=rowsize;i++){
		 for(int j=1;j<=columnsize;j++){
			 
			
			System.out.print(driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div/div[2]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText() +" " );
			
			 
		 }
		 System.out.println();
	 }
	 
	 
		
		// TODO Auto-generated method stub

	}

}
