package try1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Try {

	public static void main(String[] args) {
		WebDriver wd= new FirefoxDriver();
		wd.get("http://automationpractice.com/index.php?");
	String s=	wd.findElement(By.cssSelector("a[class='sf-with-ul']")).getAttribute("href");
	System.out.println(s);
	}

}
