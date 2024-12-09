package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.DeleteCookie;

public class Key_script {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("file:///C:/Users/Dineshkumar%20GH/Desktop/Keys.html");
	     Thread.sleep(2000);
         WebElement ele=driver.findElement(By.xpath("//input[@value='Manual']"));
         ele.sendKeys(Keys.CONTROL+"ax");
         Thread.sleep(2000);
         WebElement ele1=driver.findElement(By.xpath("//input[@vale=' ']"));
         ele1.sendKeys(Keys.CONTROL+"v); 
	}

}
