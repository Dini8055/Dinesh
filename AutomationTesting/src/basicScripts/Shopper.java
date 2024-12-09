package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopper
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.shoppersstack.com");
	     Thread.sleep(10000);
	     driver.findElement(By.xpath("//a[@id='men']")).click();
	     Thread.sleep(9000);
	     driver.findElement(By.xpath("//img[@alt=\"100% Natural Premium| Premium Badam Giri | High in Fiber & Boost Immunity | Real Nuts | Whole Natural Badam\"]")).click();
	     Thread.sleep(2000);
	}

}

