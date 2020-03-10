package java_prg;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prime {

	public static void main(String[] args) {
		WebDriver wd= new FirefoxDriver();
	wd.get("http://automationpractice.com/index.php?");
	wd.findElement(By.cssSelector("a[class='sf-with-ul']")).getAttribute("title");
		

	}
}
