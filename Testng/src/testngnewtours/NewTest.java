package testngnewtours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.POMDesign;

public class NewTest {
	WebDriver wd;
	  @Test(dataProvider = "dp")
	  public void Login(String un, String pw) throws InterruptedException 
	  {
		    POMDesign.clicklogin(wd).click();
		    POMDesign.username(wd).clear();
			POMDesign.username(wd).sendKeys(un);
			POMDesign.password(wd).clear();
			POMDesign.password(wd).sendKeys(pw);
			POMDesign.Login(wd).click();
			Thread.sleep(5000);
			wd.findElement(By.cssSelector("input[id='search_query_top']")).click();
			POMDesign.Logout(wd).click();
	  
	  }

	  @DataProvider
	  public Object[][] dp() 
	  {
	    return new Object[][] 
	    		{
	      new Object[] { "123", "123" },
	      new Object[] { "d", "RAJAN@1" },
	 
	    };
	  }
	  @BeforeTest
	  public void beforeTest() 
	  {
		  wd= new FirefoxDriver();
		  wd.get("http://automationpractice.com/index.php");
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		 wd.close();
		 System.out.println("Executed---Check resut");
	  }

}
