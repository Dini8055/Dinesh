package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args)
	{
       System.setProperty("webdriver.chrome.driver", "./Softwares/ch");
       WebDriver driver=new ChromeDriver();
       driver.get("file:///C:/Users/Dineshkumar%20GH/Desktop/tagname.html");
       Thread.sleep(2000);
       WebElement ele=driver.findElement(By.tagName("a").click());
       
	}

}
