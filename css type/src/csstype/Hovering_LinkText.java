package csstype;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovering_LinkText {

	public static void main(String[] args) throws InterruptedException 
	{
WebDriver wd= new FirefoxDriver();
wd.get("https://www.guru99.com/");
List <WebElement> l =wd.findElements(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div[1]/div/ul[1]/li"));
System.out.println(l.size());

Actions ac= new Actions(wd);

for(int i=1;i<=l.size();i++)
{

	ac.moveToElement(wd.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div[1]/div/ul[1]/li["+i+"]/a"))).build().perform();
	String z=wd.findElement(By.xpath("html/body/div[2]/section[3]/div/div/div/div/div/div/div[2]/div[1]/div/ul[1]/li["+i+"]/a")).getText();
System.out.println(i+")"+z);

}
Scanner sc= new Scanner (System.in);
System.out.println("enter input");
String a= sc.nextLine();
wd.findElement(By.linkText(a)).click();

System.out.println("---Executed----");


}
}
