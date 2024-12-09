package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected_method {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://demoapps.qspiders.com/ui/checkbox/selected?sublist=1");
	     Thread.sleep(2000);
         WebElement ele=driver.findElement(By.id(null))
	     if(title.equals("Hello Facebook"));
	    {
	    	System.out.println("TC pass");
	    	
	    }
	    else
	    {
	    	System.out.println("TC fail");
	    }
	}

}
