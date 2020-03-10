package select;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver wd= new FirefoxDriver();
		wd.get("http://newtours.demoaut.com/");
		//wd.manage().window().maximize();
		wd.findElement(By.cssSelector("input[name='userName']")).sendKeys("123");
		wd.findElement(By.cssSelector("input[name='password']")).sendKeys("123");
		wd.findElement(By.cssSelector("input[name='login']")).click();
	/*Alert msg = wd.switchTo().alert();
	System.out.println(msg.getText());
	msg.accept(); */ //to handle pop ups
		Select s;
		s= new Select(wd.findElement(By.name("fromMonth")));
//s.selectByVisibleText("London");
List <WebElement> l=s.getOptions(); // to have access to all options in list of drop down
System.out.println(l.size());

//String z= wd.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]")).getText();
//System.out.println(z);


for(int i=1;i<=l.size();i++ )
{
	//String z=l.get(i).getText();
	
	String z=wd.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]/option["+i+"]")).getText();
	System.out.println(z);
}   //to print all option availablee in drop down
try
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter your preference");
String a= sc.next();
s.selectByVisibleText(a);
}
catch(Exception e)
{
	System.out.println("enter from list");
}

s= new Select(wd.findElement(By.name("toPort")));
List <WebElement> li=s.getOptions(); // to have access to all options in list of drop down
System.out.println(li.size());

//String y= wd.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select")).getText();
//System.out.println(y);

for(int i=1;i<=li.size();i++ )
{
	//System.out.println(li.get(i).getText());
	String y= wd.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select/option["+i+"]")).getText();
	System.out.println(y);
	
} //to print all option availablee in drop down
try
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter your preference");
String b= sc.next();
s.selectByVisibleText(b);
}
catch(Exception e)
{
	System.out.println("enter from list");
}

wd.findElement(By.cssSelector("input[value='Business']")).click();

System.out.println("executed check");



//wd.close();
		
		
	
	}

	private static void clearScreen() {
		// TODO Auto-generated method stub
		
	}

	
	}


