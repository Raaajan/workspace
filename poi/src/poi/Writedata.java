package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Writedata {

	public static void main(String[] args) throws IOException {
//WebDriver wd=new FirefoxDriver();
FileInputStream f= new FileInputStream("E:\\soft setups\\automation\\workspace\\poi\\Book1.xlsx");
XSSFWorkbook w= new XSSFWorkbook(f);
XSSFSheet s= w.getSheetAt(0);
//FileOutputStream o = new FileOutputStream("E:\\soft setups\\automation\\workspace\\poi\\Book1.xlsx");
int a =s.getLastRowNum();
System.out.println(a);
for(int i=0;i<=a;i++)
{
	String v=s.getRow(i).getCell(0).toString();
	String v1=s.getRow(i).getCell(1).toString();
	System.out.println(v+" "+v1);
}

Scanner sc=new Scanner(System.in);
for(int i=a+1;i<=8;i++)
{
	System.out.println("Enter username");
	s.createRow(i).createCell(0).setCellValue(sc.next());
	System.out.println("Enter password");
	s.getRow(i).createCell(1).setCellValue(sc.next());
	FileOutputStream o = new FileOutputStream("E:\\soft setups\\automation\\workspace\\poi\\Book1.xlsx");
	w.write(o);
}


System.out.println("Done");




	}

}
