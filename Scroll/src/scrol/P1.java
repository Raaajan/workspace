
package scrol;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class P1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver wd= new FirefoxDriver();
wd.get("http://demo.guru99.com/selenium/newtours/");

List<WebElement> l=wd.findElements(By.tagName("a"));
System.out.println(l.size());
String s[]=new String[l.size()];

int i=0;
for(WebElement z:l)
{
	s[i]=z.getText();
	i++;
}

for(String m:s)
{
	System.out.println(m);
	Thread.sleep(2000);
	wd.findElement(By.linkText(m)).click();
	Thread.sleep(2000);
	wd.navigate().back();
	
	
}

wd.close();
	
	}
}






