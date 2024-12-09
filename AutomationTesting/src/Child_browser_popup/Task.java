package Child_browser_popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	     driver.get("https://www.selenium.dev/blog/");
	     Thread.sleep(3000);
	     WebElement ele= driver.findElement(By.xpath("//a[@href='/downloads']"));
	     WebElement ele1=driver.findElement(By.xpath("//a[@href='/documentation']"));
	     WebElement ele2= driver.findElement(By.xpath("//a[@href='/projects']"));
	     WebElement ele3=driver.findElement(By.xpath("//a[@href='/support']"));
	     WebElement ele4= driver.findElement(By.xpath("//a[@href='/blog']"));
	     ArrayList<WebElement> l=new ArrayList<WebElement>();
	     l.add(ele);
	     l.add(ele1);
	     l.add(ele2);
	     l.add(ele3);
	     l.add(ele4);
	     for (WebElement we : l) 
	     {
	    	 Actions act = new Actions(driver);
				act.contextClick(we).perform();
				Thread.sleep(2000);
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_T);
				r.keyRelease(KeyEvent.VK_T);
				driver.close();
		}
	    
	}

}
