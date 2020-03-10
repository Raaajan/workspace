package fileupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload {
	public static void main (String [] args) throws IOException, InterruptedException
	{
WebDriver wd= new FirefoxDriver();
		
		wd.get("file:///C:/Users/user/Desktop/automation%20work/resumeupload.html");
		wd.findElement(By.xpath("html/body/input")).click();

		Runtime.getRuntime().exec("E:\\automation\\Autoit\\workspace\\fileupload.exe");
		Thread.sleep(3000);
		
	}
}
