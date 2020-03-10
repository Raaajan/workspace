package csstype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Newtours {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\soft setups\\automation\\chromedriver\\chromedriver.exe");
		Thread.sleep(5000);
		WebDriver wd= new ChromeDriver();
		Select s;
		wd.get("http://newtours.demoaut.com/");
		wd.findElement(By.name("userName")).sendKeys("123");
		wd.findElement(By.name("password")).sendKeys("123");
		wd.findElement(By.name("login")).click();
		
		wd.findElement(By.cssSelector("input[value='oneway']")).click();// oneway
		s=new Select(wd.findElement(By.name("passCount")));
		s.selectByIndex(1);// output=2
		Thread.sleep(3000);
		
		 s=new Select(wd.findElement(By.name("fromPort")));
		 s.selectByIndex(2);//o=London
		
		 s=new Select(wd.findElement(By.name("fromMonth")));
		 s.selectByValue("4");//o=April
		 
		 s=new Select(wd.findElement(By.name("fromDay")));
		 s.selectByIndex(5);//6
		 
		 
		 
		 s=new Select(wd.findElement(By.name("toPort")));
		 s.selectByVisibleText("Paris");// paris
		 
		 
		 s=new Select(wd.findElement(By.name("toMonth")));
		 s.selectByVisibleText("August");// august
		
		 
		 s=new Select(wd.findElement(By.name("toDay")));
		 s.selectByValue("5");//5
		 
		 
		wd.findElement(By.cssSelector("input[value='Business']")).click();
		Thread.sleep(3000);
		
		wd.findElement(By.cssSelector("input[value='First']")).click();
System.out.println("Executed successfully");
	}

}
