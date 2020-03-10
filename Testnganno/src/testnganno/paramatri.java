package testnganno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramatri {
  @Test
  @Parameters({"author","search"})
  public void Para(String author, String search) 
  
  {
	  WebDriver wd= new FirefoxDriver();
	  wd.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=UgQtWpamNIKTvAS4_6O4AQ&gws_rd=ssl");
	wd.findElement(By.id("gs_htif0")).sendKeys("search");
	/*System.out.println("author="+author+"search="+search);
	String s= wd.findElement(By.id("gs_htif0")).getText();
	System.out.println(s);*/
  }
}
