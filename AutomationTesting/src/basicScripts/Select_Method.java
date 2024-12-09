package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("file:///C:/Users/Dineshkumar%20GH/Desktop/Select.html");
	     Thread.sleep(2000);
	      WebElement ele =driver.findElement(By.id("Nandanas"));
	      Select s= new Select(ele);
	     s.selectByIndex(0);
	     Thread.sleep(2000);
	     s.selectByValue("k");
	     Thread.sleep(2000);
	     s.selectByVisibleText(" Veg palav ");
	     Thread.sleep(2000);
	     s.deselectAll();
	}

}
