package trail2;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Trail2 {

	public static void main(String[] args) 
	{
WebDriver wd= new FirefoxDriver();
wd.get("https://www.guru99.com/");
Scanner sc= new Scanner (System.in);
System.out.println("enter input");
wd.findElement(By.linkText("Learn Selenium")).click();

System.out.println("---Executed----");


	}

}
