package Child_browser_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("C:\\Users\\Dineshkumar%20GH\\Desktop\\Frame1\\upload.html");
	     WebElement ele = driver.findElement(By.name("upload file"));
	     ele.sendKeys("C:\\Users\\Dineshkumar GH\\Desktop\\Selenium.jpeg");
	}

}
