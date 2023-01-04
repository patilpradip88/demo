package Jdbc_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class my_sql {

		static String un;
		static String pass;
	public static  void main() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
	//	String s="create table Demo(user varchar(55),pass varchar(40))";
		
	//	String s1="insert into Demo(user,pass) values('pradip','patil@')";
		
		Statement stm = con.createStatement();
		
		String get="select * from Demo";
		ResultSet query = stm.executeQuery(get);
		
		while(query.next())
		{
			un = query.getString(1);
			pass = query.getString(2);
		}
	   // stm.execute(s1);
	
		stm.close();
		
		
		System.out.println("table create");

		
		
		
		
		
		
		
	}
}
