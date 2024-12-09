package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo123 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[@aria-current='page']")).click();
	     Thread.sleep(2000);
	     WebElement ele = driver.findElement(By.xpath("//select[@id='select3']"));
	     Select s=new Select(ele);
	     s.selectByIndex(1);
	     driver.findElement(By.xpath("//a[@driver.findElement(By.xpath('//a[@aria-current='page']")).click();
	     Thread.sleep(2000);
	     WebElement ele1 = driver.findElement(By.xpath("//select[@id='select-multiple-native']"));
	     Select s1=new Select(ele1);
	     s1.selectByVisibleText("Running Shoes");
	     s1.selectByVisibleText("Formal Shoes");
	     s1.selectByVisibleText("Leather Jacket");
	     driver.close();
	}


}
