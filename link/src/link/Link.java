package link;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd= new FirefoxDriver();
		wd.get("http://automationpractice.com/index.php");
		
		
		
		List <WebElement> l=wd.findElements(By.xpath(".//*[@id='block_various_links_footer']/ul/li"));
		System.out.println(l.size());
		for(int i=1;i<=l.size()-1;i++)
		{
			String z=wd.findElement(By.xpath(".//*[@id='block_various_links_footer']/ul/li["+i+"]")).getText(); 
			System.out.println(z);
		}
		System.out.println();
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("select any option");
		String a=sc.nextLine();
		wd.findElement(By.linkText(a)).click();
		
		Select s;
		s=new Select(wd.findElement(By.id("selectProductSort")));
		List<WebElement> li = s.getOptions();
		System.out.println("list count="+li.size());
		for(int i=0;i<li.size();i++)
		{
		String x=li.get(i).getText();
		System.out.println(x);
		}
		System.out.println();
		System.out.println("enter option");
		String z=sc.nextLine();
		s.selectByVisibleText(z);
		Thread.sleep(5000);
		wd.close();
		System.out.println("COMPLETED");
		
		
		
		
                                                                                                                          
	}

}
