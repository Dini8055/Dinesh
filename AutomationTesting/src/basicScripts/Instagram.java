package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.Instagram.com");
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector("input[class=\"_aa4b _add6 _ac4d _ap35\"]")).sendKeys("9663080984 ");
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector("input[class=\"_aa4b _add6 _ac4d _ap35\"]")).sendKeys("9663080984");
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector("button[class=\" _acan _acap _acas _aj1- _ap30\"]")).click();
	}

}

