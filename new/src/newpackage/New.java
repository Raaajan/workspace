package newpackage;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class New {

	public static void main(String[] args) throws InterruptedException {
		
	/*	
		 -----------desired capibilities--------to bypass anyfirewall-------------
		 String t = "ip:port no";
		 Proxy p =new proxy();
		p.setHttpProxy(t);
		DesiredCapibilities d= new DesiredCapabilities();
		d.setcapabitlity(CapabilityType.PROXY,p);
		WebDriver wd=new FirefoxDriver(d);
		
		-------------------if using different browser other than firefox--------------------
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\soft setups\\automation\\chromedriver\\chromedriver.exe");
		
		*/
		
		// ------------to handle alert msg------------------------
	
	/*	Alert msg= wd.switchTo().alert();
		msg.accept(); */
		
		WebDriver wd=new FirefoxDriver();
		
		
		
		
		
		
		
		wd.get("http://automationpractice.com/index.php");
		/*wd.findElement(By.className("login")).click();
		wd.findElement(By.id("email")).sendKeys("dubeyrajan9154@gmail.com");
		wd.findElement(By.cssSelector("input#passwd")).sendKeys("RAJAN@123");
		wd.findElement(By.name("SubmitLogin")).click();*/
	//	String a ="My account - My Store";
		//String title=wd.getTitle(); 
	//	if(a.equalsIgnoreCase(title))
		{
		/*	wd.findElement(By.cssSelector("img[class='logo img-responsive']")).click();
			//---------------- to select radio button-------------------
			wd.findElement(By.xpath("html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();
		wd.findElement(By.id("layered_category_4")).click();
		wd.findElement(By.id("layered_id_attribute_group_1")).click();
		wd.findElement(By.id("layered_id_feature_5")).click();
		wd.findElement(By.id("layered_id_feature_11")).click(); */
		
		//--------------------to select from drop down option-----------------------------
		
			wd.findElement(By.cssSelector("img[class='logo img-responsive']")).click();
			wd.findElement(By.linkText("Specials")).click();
		Select s;
		s= new Select(wd.findElement(By.id("selectProductSort")));
	//	s.selectByIndex(3); // op= prd name a to z
		
		List<WebElement> li=s.getOptions();
		int c=li.size();
		System.out.println(c);
		for(int i=0;i<=c-1;i++)
		{
			String z=li.get(i).getText();
			System.out.println(z);
		
	//	Scanner sc= new Scanner (System.in);
		//System.out.println("enter string");
	//	String st=sc.nextLine();
		//s.selectByVisibleText(st);
		
	/*	for(int i=0; i<=c-1;i++)
		{
			String x=li.get(i).getText();
			if(x.equalsIgnoreCase(st))
			{
				System.out.println("match found");
				s.selectByVisibleText(x);
			}
		}
		*/
		
		
		/*
		wd.findElement(By.linkText("Best sellers")).click();
		s=new Select(wd.findElement(By.name("manufacturer_list")));
		s.selectByVisibleText("Fashion Manufacturer"); // fashion manu
		s= new Select(wd.findElement(By.name("supplier_list")));
		s.selectByValue("http://automationpractice.com/index.php?id_supplier=1&controller=supplier");
		Thread.sleep(3000);
		
		*/
		
		
		
		System.out.println("completed");
		
		
		
	/*	else
		{
			System.out.println("title does not matches");
		} */
		

	}
		}
}
}