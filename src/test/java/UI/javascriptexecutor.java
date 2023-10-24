package UI;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecutor {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		
		JavascriptExecutor jse =  (JavascriptExecutor) driver;
		
		//print page title
		String script = "document.title;";
		String title = (String) jse.executeScript(script);
		System.out.println(title);
		
		//click button
		driver.switchTo().frame("iframeResult");
		jse.executeScript("myFunction()");
		driver.switchTo().alert().accept();
		
		//highlight button
	WebElement highlightbutton=	driver.findElement(By.xpath("/html/body/button"));
	jse.executeScript("arguments[0].style.backgroundColor = 'red'",highlightbutton);
		
		
		
		// TODO Auto-generated method stub
	

	}

}
