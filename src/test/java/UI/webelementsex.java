package UI;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class webelementsex {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		driver.manage().window().maximize();
		driver.findElement(By.className("userid")).sendKeys("abc");
		driver.findElement(By.className("userid")).clear();
		driver.findElement(By.className("userid")).getAttribute("class");
		System.out.println(driver.findElement(By.className("userid")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[2]\"))")).getCssValue("    text-transform"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\\\"signin-form\\\"]/div[2]\"))")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[2]")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[2]")).getText());
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[2]")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[2]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[2]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[2]")).isSelected());
		


		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		

	}

}
