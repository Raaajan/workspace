package csstype;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

// To take link input from user and click on that (not working doubt)
public class Doubt {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
WebDriver wd= new FirefoxDriver();
wd.get("https://www.guru99.com/");
List <WebElement> l =wd.findElements(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div[1]/div/ul[1]/li"));
System.out.println(l.size());

Actions ac= new Actions(wd);

for(int i=1;i<=l.size();i++)
{
	Thread.sleep(2000);
	ac.moveToElement(wd.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div[1]/div/ul[1]/li["+i+"]/a"))).build().perform();
	String z=wd.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div[1]/div/ul[1]/li["+i+"]/a")).getText();
System.out.println(i+")"+z);

}


System.out.println("Enter input");
String a = sc.next();



for (int i=1; i<=l.size();i++)
{
	String y =wd.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div[1]/div/ul[1]/li["+i+"]/a")).getText();
if(a.equals(y))
{
	System.out.println("Match found");
	wd.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div[1]/div/ul[1]/li["+i+"]/a")).click();
	
	
}

System.out.println();
System.out.println("------Executed Successfully------");
	}

	}
}
