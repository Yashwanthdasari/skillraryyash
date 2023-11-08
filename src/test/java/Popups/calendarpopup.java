package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.className("commonModal__close")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		WebElement e=driver.findElement(By.xpath("//div[@aria-label='Wed Sep 27 2023']"));
		System.out.println(e.getAttribute("aria-label"));
		
		Thread.sleep(2000);
		driver.close();
	}

}
