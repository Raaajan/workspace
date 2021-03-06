package multiplewindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindow 
{
  @Test
  public void mw() throws InterruptedException 
  
  {
	  WebDriver wd=new FirefoxDriver();
	  
	  wd.get("http://demo.guru99.com/popup.php");
	  wd.findElement(By.xpath("html/body/p/a")).click();
	  Thread.sleep(2000);
	  String mainwin=wd.getWindowHandle();
	  Set<String> s1 =wd.getWindowHandles();
	  Iterator <String> i1=s1.iterator();
	  
	  
	  while(i1.hasNext())
	  {
		  String childwin=i1.next();
		  if(!mainwin.equalsIgnoreCase(childwin))
		  {
			  wd.switchTo().window(childwin);
			 
			  wd.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
			  wd.findElement(By.name("btnLogin")).click();
			  System.out.println("child window");
			  wd.close();
			  Thread.sleep(3000);
		  }
		  
		  wd.switchTo().window(mainwin);
		  Thread.sleep(1000);
		  System.out.println("main window");
		  wd.close();
	  }
	  
	  
	  
	  
  }

} 