package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMDesign {


		static WebElement we;
		
		public static WebElement clicklogin (WebDriver wd)
		{
			we=wd.findElement(By.cssSelector("a.login"));
			return we;
		}
		
		public static WebElement username(WebDriver wd)
		{
			we=wd.findElement(By.name("email"));
			return we;
			
		}
		
		public static WebElement password(WebDriver wd)
		{
			we=wd.findElement(By.name("passwd"));
					return we;
		}
		
		public static WebElement Login (WebDriver wd)
		{ 
          we=wd.findElement(By.name("SubmitLogin"));
          return we;
	}
	
	public static WebElement Logout (WebDriver wd)
	{
		we=wd.findElement(By.xpath("html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[2]/a"));
		return we;
	}
}
