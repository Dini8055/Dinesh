package Child_browser_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_upload1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
	     Thread.sleep(2000);
	     WebElement ele = driver.findElement(By.name("file"));
	     Thread.sleep(2000);
	     ele.sendKeys("C:\\Users\\Dineshkumar GH\\Desktop\\Selenium.jpeg");
	     driver.close();
	}

}
