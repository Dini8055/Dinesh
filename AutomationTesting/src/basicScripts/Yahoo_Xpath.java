package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Xpath {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://login.yahoo.com/manage_account?");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@class='phone-no show-icon used']")).sendKeys("dinesh96@myyahoo.com ");
	     Thread.sleep(2000);
	    
	
	}

}
