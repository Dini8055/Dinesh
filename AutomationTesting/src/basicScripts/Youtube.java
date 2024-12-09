package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.youtube.com");
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector("ytd-searchbox[id='search']")).sendKeys("kantara trailor");
	     Thread.sleep(3000);
	     driver.findElement(By.cssSelector("button[id=\"search-icon-legacy\"]")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.cssSelector("script[nonce class=\"js-httpswwwyoutubecomsdesktopfd504f58jsbindesktop_polymervflsetdesktop_polymerjs\"]")).click();
	}

}
