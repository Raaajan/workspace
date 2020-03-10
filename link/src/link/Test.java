package link;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new FirefoxDriver();
		wd.get("http://demo.guru99.com/selenium/delete_customer.php");
		wd.findElement(By.name("cusid")).sendKeys("6757");
		wd.findElement(By.name("submit")).click();
		Alert msg= wd.switchTo().alert();
		Thread.sleep(5000);
		msg.dismiss();
	//	msg.accept();
	}

}
