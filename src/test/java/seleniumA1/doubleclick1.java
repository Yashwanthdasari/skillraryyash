package seleniumA1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement courseTab=driver.findElement(By.id("course"));
		Actions action=new Actions(driver);
		action.moveToElement(courseTab).perform();
		driver.findElement(By.xpath("//span/a[text()='DevOps']")).click();
		
		WebElement plusbutton=driver.findElement(By.id("add"));
		action.doubleClick(plusbutton).perform();
		Thread.sleep(2000);
		driver.close();

	}

}
