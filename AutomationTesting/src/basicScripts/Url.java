package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Url 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
