package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_FBlogin_Xpath {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9663080984 ");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9663080984");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@name='login']")).click();
	
	}

}
