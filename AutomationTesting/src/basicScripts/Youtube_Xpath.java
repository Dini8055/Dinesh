package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.youtube.com/watch?v=8mrVmf239GU");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("button[id=\"search-icon-legacy\"]")).click();
	     Thread.sleep(3000);
	}
	}


