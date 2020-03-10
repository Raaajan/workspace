package csstype;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Relativeandhovering {

	public static void main(String[] args) throws InterruptedException
	{
WebDriver wd= new FirefoxDriver();
		wd.get("http://automationpractice.com/index.php");
		/*wd.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		wd.findElement(By.xpath(".//*[@id='email']")).sendKeys("dubeyrajan9154@gmail.com");
		wd.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("RAJAN@123");
		wd.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
		wd.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();*/
		
		//wd.manage().window().maximize();
		List <WebElement> l= wd.findElements(By.xpath(".//*[@id='block_top_menu']/ul/li"));
		System.out.println(l.size());
		Actions a =new Actions(wd);
		
		for(int i=1;i<=l.size();i++)
		{
			Thread.sleep(3000);
a.moveToElement(wd.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li["+i+"]/a"))).build().perform();

String m =wd.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li["+i+"]/a")).getText();
System.out.println(m);

		}
		
		
		System.out.println("executed Successfully");
		wd.close();
	}

}
