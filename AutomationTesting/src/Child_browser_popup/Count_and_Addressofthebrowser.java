package Child_browser_popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_and_Addressofthebrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://skpatro.github.io/demo/links/");
	     Thread.sleep(2000);
	     driver.findElement(By.name("NewWindow")).click();
	    Set<String> allwh = driver.getWindowHandles();
	    System.out.println(allwh.size());
	    for (String w : allwh) 
	    {
			System.out.println(w);
		}

	}

}
