package JSE;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down_up_thrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 3; i++) 
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
		}
		for (int i = 0; i < 3; i++) 
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(2000);
		}
		driver.close();
	}

}
