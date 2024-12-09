package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.redbus.in/");
	     driver.findElement(By.xpath("//span[.='Date']")).click();
	     driver.findElement(By.xpath("//span[.='20']")).click();
	     Thread.sleep(2000);
	     
	}

}
