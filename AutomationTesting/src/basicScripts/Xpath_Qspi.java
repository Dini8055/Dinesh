package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Qspi
{
public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Dini");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[@href=\"/ui/button\"]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@id='btn']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//section[@class='poppins text-[14px]']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[@class=href='link/contact']")).click();
	}


}
