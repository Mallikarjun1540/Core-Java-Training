package jdbc;

import java.sql.*;

class TableCreateDemo {
	public static void main(String args[]) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:/// batch7542", "root", "12345");
			Statement stmt = con.createStatement();
			String query = "create table list(id int, name varchar(20))";

			stmt.executeUpdate(query);

			System.out.println("created");
		}
		catch (Exception e) {
			System.out.println("Exception has occured " + e);
		}
	}
}