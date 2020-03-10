package testngnewtours;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Newtoursng 
{
	WebDriver wd;
  @Test(dataProvider = "dp")
  public void f(String us, String pw) throws InterruptedException 
  {
	  wd.findElement(By.name("userName")).clear();
	  wd.findElement(By.name("userName")).sendKeys(us);
	  Thread.sleep(500);
	  wd.findElement(By.name("password")).clear();
	  wd.findElement(By.name("password")).sendKeys(pw);
	  Thread.sleep(500);
	  wd.findElement(By.name("login")).click();
	  Thread.sleep(500);
	  wd.findElement(By.linkText("SIGN-OFF")).click();
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][]
   {
      new Object[] { "df", "ajhg" },
      new Object[] { "123", "123" },
      new Object[] { "1234", "1234" },
      new Object[] { "123a", "123" },
    };
  }
  @BeforeTest
  public void beforeTest() 
  {
	  wd=new FirefoxDriver();
	  wd.get("http://newtours.demoaut.com/");
  }

  @AfterTest
  public void afterTest() throws InterruptedException 
  {
	  Thread.sleep(500);
	  wd.close();
	  System.out.println("Executed-------check result");
  }

}
