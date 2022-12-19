package tdd;
import java.sql.*;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ass3
{
	public static boolean checkUNamePwd()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String uname=sc.next();
		System.out.println("Enter password");
		String pwd=sc.next();
			try
			{  
				Class.forName("com.mysql.cj.jdbc.Driver"); 				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","Akash@123"); 
				 
				java.sql.Statement stmt = con.createStatement();
				//String sql="insert into demo(username,password)values('vinod','vinod@123')";
				//stmt.executeUpdate(sql);
				ResultSet rs=stmt.executeQuery("select * from demo where username='"+uname+"' && password='"+pwd+"'");
				//ResultSet rs1=stmt.executeQuery("select * from demo where password='"+pwd+"'");
				
				if(rs.next()==true)
				{
					return true;
				}
//				else
//				{
//					System.out.println("found");
//				}
				//System.out.println("ok work");
				 
			}
			catch(Exception e)
			{ 
				System.out.println(e);
			}
			return false;  
	}  

	

}
