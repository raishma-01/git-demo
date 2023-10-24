package UI;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		Date currentdate = new Date();
		System.out.println(currentdate);
	String screenshotfilename =	currentdate.toString().replace(" ","-").replace(":","-");
	System.out.println(screenshotfilename);
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(screenshotFile, new File(".//screenshot/" + screenshotfilename + ".png" ));
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/" + screenshotfilename + ".png"));
		// TODO Auto-generated method stub  
		
		
		
		
		

	}

}
