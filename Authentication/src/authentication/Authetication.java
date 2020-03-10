package authentication;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Authetication {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver wd= new FirefoxDriver();
		
		wd.get("https://www.engprod-charter.net");

		Runtime.getRuntime().exec("E:\\automation\\Autoit\\workspace\\authentication.exe");
		Thread.sleep(3000);
	}

}
