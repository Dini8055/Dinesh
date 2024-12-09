package JSE;

import java.awt.Window;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) 
		{
			driver.switchTo().window(wh);
			Thread.sleep(3000);
			
		}
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(3000);
		Point p = ele.getLocation();
		int y = p.getY();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Accept Our Policy']")).click();
		Thread.sleep(5000);
		driver.quit();
		
			}
	
	}
