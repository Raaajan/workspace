package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Readdata
{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver wd=new FirefoxDriver();
		

FileInputStream f= new FileInputStream("E:\\soft setups\\automation\\workspace\\poi\\Book1.xlsx");
XSSFWorkbook w= new XSSFWorkbook(f);
XSSFSheet s = w.getSheetAt(0);
int c =s.getLastRowNum();
System.out.println(c);

wd.get("http://newtours.demoaut.com/");
for(int i=0; i<=4; i++)
{

	String y= s.getRow(i).getCell(0).toString();                                                                                                                                                   
	wd.findElement(By.name("userName")).sendKeys(y);
	
	String z=s.getRow(i).getCell(1).toString();
	wd.findElement(By.name("password")).sendKeys(z);
	
	wd.findElement(By.name("login")).click();
	
wd.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
	Thread.sleep(500);
	wd.findElement(By.cssSelector("a[href='mercurywelcome.php']")).click();
	
	System.out.println(y+"   "+z);
}

//-----------OR---------------

/*
for(int i=0; i<=4;i++)
{
	for(int j=0;j<2;j++)
	{
		String z= s.getRow(i).getCell(j).toString();
		System.out.println(z);
		
	}
System.out.println();
}
*/

	}

}
