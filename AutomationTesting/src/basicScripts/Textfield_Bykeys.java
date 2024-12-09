package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfield_Bykeys {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("file:///C:/Users/Dineshkumar%20GH/Desktop/textfield.html"
	     		+ "");
	     Thread.sleep(2000);
	     WebElement ele=driver.findElement(By.xpath("//input[@id='a1']"));
        ele.sendKeys(Keys.SPACE);
        Thread.sleep(2000);
        WebElement ele2=driver.findElement(By.xpath("//input[@id='a2']"));
        ele2.sendKeys(Keys.SPACE);
        Thread.sleep(2000);
        WebElement ele3=driver.findElement(By.xpath("//input[@id='a3']"));
        ele3.sendKeys(Keys.SPACE);
        Thread.sleep(2000);
        WebElement ele4=driver.findElement(By.xpath("//input[@id='a4']"));
        ele4.sendKeys(Keys.SPACE);
        Thread.sleep(2000);
        WebElement ele5=driver.findElement(By.xpath("//input[@id='a5']"));
        ele5.sendKeys(Keys.SPACE);
	}

}
