package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.Flipkart.com");
	     Thread.sleep(10000);
	     driver.findElement(By.xpath("//img[@alt=\"Mobiles & Tablets\"]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//img[@src=\"https://rukminim2.flixcart.com/fk-p-flap/844/140/image/85b6c74cb0046bed.jpg?q=50\"]")).click();
	     driver.findElement(By.xpath("//img[@alt=\"vivo T3 Lite 5G (Vibrant Green, 128 GB)\"]")).click();
	}

}
