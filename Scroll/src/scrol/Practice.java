package scrol;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver wd=new FirefoxDriver();
		wd.get("http://demo.guru99.com/selenium/upload/");
		/*Actions a= new Actions(wd);
		WebElement e= wd.findElement(By.id("email"));
		a.moveToElement(e).keyDown(e, Keys.SHIFT).sendKeys("hello").keyUp(e, Keys.SHIFT).doubleClick(e).build().perform();
		
		Thread.sleep(8000);
		
		a.moveByOffset(0, 1000).build().perform();
		*/
		
	//	((JavascriptExecutor)wd).executeScript("scroll(0,800)");
	
			
		wd.findElement(By.id("uploadfile_0")).sendKeys("E:\\resume\\R1.docx");
		wd.findElement(By.xpath(".//*[@id='terms']")).click();
		wd.findElement(By.id("submitbutton")).click();

	

		
		System.out.println("Completed");
		
		
				
		

	}

}
