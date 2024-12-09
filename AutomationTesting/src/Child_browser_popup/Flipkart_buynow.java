package Child_browser_popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_buynow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https:https://www.flipkart.com/sports/cycling/electric-cycle");
	     Thread.sleep(2000);
}
}
