package Jdbc_java;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Data_transfer {
	
	@Test
	public void dataprovide() throws ClassNotFoundException, SQLException
	{
		System.setProperty("webdriver.edge.driver","D:\\Selenium Jar\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver dr=new EdgeDriver();
		
		dr.get("https://www.demo.guru99.com/V4/");
		
		my_sql.main();
		
		dr.findElement(By.name("uid")).sendKeys(my_sql.un);
		dr.findElement(By.name("password")).sendKeys(my_sql.pass);
		dr.findElement(By.name("btnLogin")).click();
		
		
	}

}
