
package jdbc;

import java.sql.*;

class InsertValuesDemo {
	public static void main(String args[]) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:/// batch7542", "root", "12345");
			Statement stmt = con.createStatement();

			String query = "insert into list values(10,'Arjun')";
			int a = stmt.executeUpdate(query);
			if (a > 0) {
				System.out.println("Values Inserted");
			}

		}

		catch (Exception e) {
			System.out.println("Exception has occured " + e);
		}
	}
}