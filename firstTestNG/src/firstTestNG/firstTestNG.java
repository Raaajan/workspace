package firstTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firstTestNG {
  @Test
  public void verify() 
  {
	  WebDriver wd= new FirefoxDriver();
	  wd.get("http://demo.guru99.com/selenium/newtours/");
	  String a= wd.getTitle();
	  String e= "Welcome: Mercury Tour";
	  if(a.equalsIgnoreCase(e))
	  {
		  System.out.println("title matched");
		  
	  }
	  else
	  {
		  System.out.println("Title not matched");
	  }
	  
	  wd.close();
  }
}
