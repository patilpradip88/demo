package Jdbc1_java;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoweb {

	@Test
	public void demo() throws ClassNotFoundException, SQLException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jar\\chromedriver_win32 (9)\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://demowebshop.tricentis.com/register");
		
		Sqldata.shop();
		
		
		dr.findElement(By.id("FirstName")).sendKeys(Sqldata.id);
	}
}
