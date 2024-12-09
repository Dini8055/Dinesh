package Child_browser_popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Add_parent {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://skpatro.github.io/demo/links/");
	     Thread.sleep(2000);
	    String w = driver.getWindowHandle();
	    System.out.println(w);
	}

}
