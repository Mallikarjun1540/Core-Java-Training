package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class CommitandRollback 
{

	public static void main(String[] args) throws Exception 
	{
		try 
		{
			
			  Class.forName("com.mysql.cj.jdbc.Driver"); Connection
			  con=DriverManager.getConnection("jdbc:mysql:///batch7542","root","12345");
			  Statement stmt=con.createStatement(); 
			  String query1="create table teacher(id int,name varchar(20),email varchar(20))";
			 stmt.executeUpdate(query1); System.out.println("Table is created");
			 

		
			con.setAutoCommit(false);
			String query = "insert into teacher values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			while (true) 
			{
				System.out.println("Enter teacher Id");
				int id = sc.nextInt();

				System.out.println("Enter teacher Name");
				String name = sc.next();

				System.out.println("Enter teacher E-mail Id");
				String email = sc.next();

				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, email);
				pstmt.executeUpdate();
				System.out.println("commit/rollback");
				String answer = sc.next();
				if (answer.equals("commit")) 
				{
					con.commit();
				}
				if (answer.equals("rollback")) 
				{
					con.rollback();
				}
				System.out.println("want to add more records y/n");
				String ans = sc.next();
				if (ans.equals("n")) {
					break;
				}

			}
			con.commit();
			System.out.println("record saved");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
