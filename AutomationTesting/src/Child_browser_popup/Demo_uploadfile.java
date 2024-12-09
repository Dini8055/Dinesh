package Child_browser_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_uploadfile {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	     driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
	     Thread.sleep(2000);
	     WebElement ele = driver.findElement(By.name("file"));
	     Thread.sleep(2000);
	     ele.sendKeys("C:\\Users\\Dineshkumar GH\\Desktop\\Selenium.jpeg");
	}

}
