package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com");
	     driver.findElement(By.cssSelector("input[name='email']")).sendKeys("9663080984");
	     driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("9663080984");
	     Thread.sleep(2000);
	     driver.findElement(By.name("login")).click();
	}

}
