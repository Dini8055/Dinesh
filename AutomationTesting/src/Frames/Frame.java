package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("file:///C:/Users/Dineshkumar%20GH/Desktop/Frames/mainpage.html");
	     WebElement usn =driver.findElement(By.xpath("//input[@type='text']"));
	     usn.sendKeys("Dini");
	     Thread.sleep(2000);
	     driver.switchTo().frame(0);
	     WebElement pwd =driver.findElement(By.xpath("//input[@type='text']"));
	     pwd.sendKeys("BOSS");
	     
	}

}
