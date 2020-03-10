package testnganno;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Testngaano 
{
	WebDriver wd;
	
  @Test (priority = 0)
  public void Test1 ()
  {
	  wd.findElement(By.linkText("REGISTER")).click();
	  System.out.println("Test1");
  }
  @Test(priority = 1) 
  public void Test2()
  {
	  wd.findElement(By.linkText("SUPPORT")).click();
	  System.out.println("Test2");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  wd.findElement(By.linkText("Home")).click();
	  System.out.println("After method");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  wd=new FirefoxDriver();
	  wd.get("http://demo.guru99.com/selenium/newtours/");
	  System.out.println("Before Test");
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("after test");
	  wd.close();
  }

}