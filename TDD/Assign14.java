package tdd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Assign14
{
	static Scanner sc = new Scanner(System.in);
	static String username1;
	static String password1;
	static String add;
	static String mb;

	static Assign14 obj= new Assign14();
	
	public static String getUsername1() {
		return username1;
	}


	public static void setUsername1(String username1)// username validation 
	{
		 int count1=0; 
		 int countv=0;
		 int countd=0;
		 int countu=0; 
		 for(int i=0;i<username1.length();i++)
		 {
			 char ch= username1.charAt(i);
			 if(ch >='a' && ch<='z')
			 {
				 count1++;
			 }
			 if(ch >='A' && ch<='Z')
			 {
				 countv++;
			 }		
			 if( ch=='_')
			 {
				 countu++;
			 }	
			 if(ch >='0' && ch<='9' )
			 {
				 countd++;
			 }
		 }
		 if(username1.length() ==8 && count1 != 0 && countu != 0 && countd != 0 && countv !=0)
		 {
			 Assign14.username1 = username1;
			
		 }	
		 else
		 {
			 System.out.println("Enter username again contains alphabets ,digits,_ and length 8");
			 setUsername1(sc.next());
		 }
	}


	public static String getPassword1() {
		return password1;
	}


	public static void setPassword1(String password1)//password validation
	{
		 int count1=0; 
		 int countv=0;
		 int countd=0;
		 int countu=0;
		 
		 for(int i=0;i<password1.length();i++)
		 {
			 char ch= password1.charAt(i);
			 if(ch >='a' && ch<='z')
			 {
				 count1++;
			 }
			 if(ch >='A' && ch<='Z')
			 {
				 countv++;
			 }		
			 if( ch=='_' || ch=='@' || ch=='#' || ch=='&'|| ch=='='|| ch=='!' || ch=='*'|| ch=='-') 
			 {
				 countu++;
			 }	
			 if(ch >='0' && ch<='9' )
			 {
				 countd++;
			 }
		 }
		 if( password1.length() >= 8 && count1 != 0 && countu !=0 && countd != 0 && countv !=0)
		 {
			 Assign14.password1 = password1;
			 
		 }
		 else
		 {
			 System.out.println("Enter password again contains alphabets ,digits,_ and length 8");
			 setPassword1(sc.next());
		 }
	}


	public static String getAdd() {
		return add;
	}


	public static void setAdd(String add) {
		Assign14.add = add;
	}


	public static String getMb() {
		return mb;
	}


	public static void setMb(String mb)// mobile no validation gives inly 10 digits mb
	{
		int cnt=0;
		for(int i=0;i<mb.length();i++)
		{
			char ch=mb.charAt(i);
			if(ch>='0' && ch<='9')
				cnt++;
		}
		if(cnt==10)
		{
		Assign14.mb = mb;
		}
		else
		{
			System.out.println("Enter 10 digits Phone no");
			setMb(sc.next());	
		}
	}
	
	public static boolean checkUser()//check user if exists show info else register user then show info
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		setUsername1(sc.next());
		System.out.println("Enter password");
		setPassword1(sc.next());
		
		boolean case1=obj.connection_method();
		return case1;
	}
	
	public static boolean connection_method()//connection method 
	{
		try
		{  
			Class.forName("com.mysql.cj.jdbc.Driver"); 				
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","Akash@123"); 			 
			java.sql.Statement stmt = con.createStatement();			
			ResultSet rs=stmt.executeQuery("select * from  userdetails where username='"+getUsername1()+"' && password='"+getPassword1()+"'"); 
			if(rs.next()==true) 
			{
				System.out.println("***********your information**********");
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));  
				  
			}
			else
			{
				System.out.println("---You are not registered user------");
				System.out.println("please Register here,,,,,,,");
				addUserDetails();
				String sql="insert into  userdetails(username,password,address,phoneno)values('"+getUsername1()+"','"+getPassword1()+"','"+getAdd()+"','"+getMb()+"')";
				stmt.executeUpdate(sql);
				ResultSet rs1=stmt.executeQuery("select * from  userdetails where username='"+getUsername1()+"' && password='"+getPassword1()+"'"); 
				if(rs1.next()==true) 
				{
					System.out.println(rs1.getString(1)+"  "+rs1.getString(2)+"  "+rs1.getString(3)+" "+rs1.getString(4)+" "+rs1.getString(5));  
				}
			}
			
			con.close();  
			}
			catch(Exception e)
			{ 
				System.out.println(e);
			}
		return true;  
			  
	}
	
	public static void addUserDetails()
	{
		System.out.println("Enter Username");
		setUsername1(sc.next());		
		
		System.out.println("Enter Password");
		setPassword1(sc.next());
		
		System.out.println("Enter Address");
		setAdd(sc.next());
		
		System.out.println("Enter Phone no");
		 setMb(sc.next());		
	}

}

