package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]"));
		Thread.sleep(3000);
		driver.findElement(By.id("file-upload"))
		.sendKeys("C:\\Users\\yashw\\OneDrive\\Documents\\resume\\yashu 661 resume-converted.pdf");
		 
		Thread.sleep(11000);
		driver.close();
		
		
	}

}
