package csstype;
// css selector

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Csstype {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc=new Scanner(System.in);
		/* ProfilesIni i= new ProfilesIni();
		WebDriver wd= new FirefoxDriver(i.getProfile("default")); */ // to bypass firewall in firefox
		
		/*Proxy p= new Proxy();
		String a="ip:port no";
		p.setHttpProxy(a);
		DesiredCapabilities d= new DesiredCapabilities();
		d.setCapability(CapabilityType.PROXY, p);
		WebDriver wd=new FirefoxDriver(d);*/ //To bypass firewall in anybrowser
		
		
		
		WebDriver wd= new FirefoxDriver();
		wd.get("http://automationpractice.com/index.php");
		wd.manage().window().maximize();
		String title="My Store";
		System.out.println("Title is"+" "+title);
		String T= wd.getTitle();
		System.out.println("web title is"+" "+T);
		
		if(title.equals(T))
		{
			System.out.println("title matched");
		wd.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();// sing in
		/*System.out.println("enter email id");
		String email=sc.next();
		System.out.println("enter password");
		String pass=sc.next();*/
		Thread.sleep(2000);
		wd.findElement(By.cssSelector("input#email")).sendKeys("dubeyrajan9154@gmail.com");// id used with "tagname#idvalue"
		Thread.sleep(3000);
		wd.findElement(By.id("passwd")).sendKeys("RAJAN@123");
		wd.findElement(By.id("SubmitLogin")).click();
		wd.findElement(By.cssSelector("a[title='Women']")).click();// attribute format "tagname[attirbutename='value']"
	//	wd.findElement(By.cssSelector("i.icon-home")).click();// class used with "tagname.classvalue"
		Thread.sleep(9000);
		/*wd.findElement(By.cssSelector("input#search_query_top")).click();
		wd.findElement(By.cssSelector("input#search_query_top")).sendKeys("tshirt");*/
		
	wd.findElement(By.xpath(".//*[@id='categories_block_left']/div/ul/li[1]/span")).click();
		
		wd.findElement(By.xpath(".//*[@id='categories_block_left']/div/ul/li[1]/ul/li[1]/a")).click();
		
		wd.findElement(By.cssSelector("select#selectProductSort")).sendKeys("In stock");
		
		
		
		
		
		/*wd.findElement(By.linkText("Sign out")).click();
		wd.close();*/
		}
		else
		{
			System.out.println("Title does not matched");
		}
		
		
	}

}
