package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkelement {

	public static void main(String[] args) throws InterruptedException {

WebDriver wd= new FirefoxDriver();
wd.get("http://newtours.demoaut.com/index.php");
List <WebElement> l= wd.findElements(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
int a=l.size();
System.out.println("size="+" "+a);
for(int i=1;i<=l.size();i++)
{
	String z= wd.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr["+i+"]")).getText();
	System.out.println(z);
	wd.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr["+i+"]")).click();
	
}
	
	wd.close();
	
	}

}
