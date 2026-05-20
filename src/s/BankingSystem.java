package s;

import java.util.*;
//import java.sql.*;

class User
{
		private 
		   String user_name;
		   long Acc_no,Aadhar_no,PAN_no;
		public
		
		   void Detail()
		   {
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Enter Acc_no:");
			   Acc_no=sc.nextLong();
		   }
		   void Create_user()
		   {
			   int choice;
			   Scanner sc=new Scanner(System.in);
			   try{
			   System.out.println("Enter User Name:");
			   user_name=sc.nextLine();
			   System.out.println("Proof OF Identification");
			   System.out.println("1] Aadhar Card");
			   System.out.println("2] PAN Card");
			   choice=sc.nextInt();
			   
			   if(choice==1)
			   {
				   System.out.println("Enter Aadhar Number:");
				   Aadhar_no=sc.nextLong();
			   }
			   else if(choice==2)
			   {
				    System.out.println("Enter PAN Number:");
					PAN_no=sc.nextLong();
			   }
			   else
			   {
				    System.out.println("Choose Appropriate Option!!");
					Create_user();
			   }
			   }
			   catch(Exception e)
			   {
				   System.out.println(e);
			   }
			   
		   }
		   
}	
class Database
{
	void Access()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sakila",
                "root", "Tkale@2005");
				Statement stmt =con.createStatement();
				boolean flag = stmt.execute("Create table Emp (Emp int, Name varchar(20))");
				if(flag)
				{
					System.out.println("Scussessful");
				}
				else
				{
					System.out.println("Not Scussessful");
				}
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
	}
}
class BankingSystem
{
	public static void main(String []args)
	{
		User u=new User();
		u.Detail();
		u.Create_user();
		
		Database db =new Database();
		db.Access();
	}
}
