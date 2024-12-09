package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Verifying_FBpage {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com");
	     Thread.sleep(2000);
	    String title=driver.getTitle();
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

