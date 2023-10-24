package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class loginui9 {
	

	public static void main(String[] args) {
	/*// 
		driver.get("https://www.staples.ca/");
		//driver.findElement(By.id("email")).sendKeys("standard-user");
		//driver.findElement(By.id("password")).sendKeys("secret-sauce");
		//driver.findElement(By.id("Sign In")).click();
	//	driver.findElement(By.className("r0")).sendKeys("testing");
		//driver.findElement(By.cssSelector("#\\:r0\\:")).click();
		//driver.findElement(By.name("password")).sendKeys("testing");
		//driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div/div[1]/div/form/div[4]/button/span")).click();
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//String CurrentUrl = driver.getCurrentUrl();
		// System.out.println(CurrentUrl);
		// driver.getTitle();
		// String GetTitle = driver.getTitle();
	//	 System.out.println(GetTitle);
		// driver.getPageSource();
	//	 String GetPageSource = driver.getPageSource();
		// System.out.println(GetPageSource);
		// driver.quit();*/
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver(); 
			driver.get("https://www.saucedemo.com/v1/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys(Keys.)
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			
			//driver.findElement(By.id("password")).clear();
		
			//driver.findElement(By.id("Sign In")).click();
			//driver.findElement(By.id("login-button")).click();
		
		
		
		

		// TODO Auto-generated method stub
			//driver.findElement(By.name("user-name")).sendKeys("standard_user1");
		//	driver.findElement(By.name("user-name")).clear();
			System.out.println(driver.findElement(By.name("user-name")).getAttribute("class"));
			System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getCssValue("text-transform"));
			System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getSize());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getLocation());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getText());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).getTagName());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isSelected());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isDisplayed());
	
	System.out.println(driver.findElement(By.xpath("//*[@id=\"login-button\"]")).isEnabled());
	}

}
