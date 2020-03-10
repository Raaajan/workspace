package pomnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pom.POMDesign;

public class Pomnew {

	public static void main(String[] args) throws InterruptedException {
WebDriver wd=new FirefoxDriver();
wd.get("http://automationpractice.com/index.php");
POMDesign.clicklogin(wd).click();
POMDesign.username(wd).sendKeys("dubeyrajan9154@gmail.com");
POMDesign.password(wd).sendKeys("RAJAN@123");
POMDesign.Login(wd).click();
Thread.sleep(1000);
POMDesign.Logout(wd).click();

System.out.println("Executed");
wd.close();

	}

}
