package trail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Trail {

	public static void main(String[] args)throws Exception
	{

WebDriver wd= new FirefoxDriver();
wd.get("http://automationpractice.com/index.php");
wd.manage().window().maximize();

/*wd.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
wd.findElement(By.id("email")).sendKeys("dubeyrajan9154@gmail.com");
Thread.sleep(3000);
wd.findElement(By.id("passwd")).sendKeys("RAJAN@123");
wd.findElement(By.id("SubmitLogin")).click();
Thread.sleep(3000);
wd.findElement(By.linkText("Sign out")).click();
		wd.close();*/

String e=wd.findElement(By.cssSelector("a[class='sf-with-ul']")).getAttribute("title");
System.out.println(e);
	
	}
}				