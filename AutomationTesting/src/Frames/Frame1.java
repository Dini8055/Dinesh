package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClearElement;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("file:///C:/Users/Dineshkumar%20GH/Desktop/Frame1/Un.html");
	     WebElement usn =driver.findElement(By.xpath("//input[@type='text']"));
	     usn.sendKeys("Rocking");
	     Thread.sleep(2000);
	     driver.switchTo().frame(0);
	     WebElement Pwd =driver.findElement(By.xpath("//input[@type='text']"));
	     Pwd.sendKeys("Star");
	     driver.switchTo().frame(0);
	     WebElement mob =driver.findElement(By.xpath("//input[@type='text']"));
	     mob.sendKeys("Yash");
	     driver.switchTo().frame(0);
	     WebElement em =driver.findElement(By.xpath("//input[@type='text']"));
	     em.sendKeys("BOSS");
	     //Parent Frame
	     driver.switchTo().parentFrame();
	     mob.sendKeys("Yash");
	     mob.clear();
	}

}
