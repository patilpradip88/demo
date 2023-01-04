package Jdbc1_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqldata {
	
	static String id;
	static String name;
	static String mobno;
	static String comname;
	
	
	public static void shop()throws ClassNotFoundException, SQLException
	{  
		Class.forName("com.mysql.jdbc.Driver");
		
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
	//	String s="create table Class(id int,name varchar(44),mobno long,companyname varchar(55))";
		
	//	String s1="insert into Class(id,name,mobno,companyname) values(101,'pradip',9922862888,'amazon')";
		
		Statement stm = con.createStatement();
		
		String s2="select * from Class";
		
		ResultSet ex = stm.executeQuery(s2);
		// stm.execute(s1);
		
		while(ex.next())
		{
			 id = ex.getString(1);
			 name = ex.getString(2);
			 mobno=ex.getString(3);
			 comname=ex.getString(4);
			 
			
		}
		
		con.close();
		//stm.close();
		
		System.out.println("insert table");
		
		
	}
	

}
