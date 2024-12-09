package basicScripts;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script_Asending 
{
	public static void main(String[] args) 
	{
		qq
	      Select s= new Select(ele);
	     TreeSet<String> l = new TreeSet<String>();
	     List<WebElement> opt = s.getOptions();
	      for(WebElement we:opt)
	     {	 
             String text = we.getText();
             l.add(text);
	     }
	      for(String l1:l)
	      {
	      System.out.println(l1);
	      }
	}
}
