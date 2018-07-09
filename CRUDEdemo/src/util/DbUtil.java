package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/";
		String database = "StudentDb";
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(url+database, "root", "");
	}
}
