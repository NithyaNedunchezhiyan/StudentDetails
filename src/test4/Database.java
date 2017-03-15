package test4;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Database {
	public static Connection getConnection() throws DatabaseException {
		Connection con = null;
		try {
			FileInputStream dbfile = new FileInputStream("test.properties");
			Properties prop = new Properties();
			prop.load(dbfile);

			String driverName = prop.getProperty("driverName");
			String url = prop.getProperty("url");
			String userName = prop.getProperty("userName");
			String password = prop.getProperty("password");

			Class.forName("com.mysql.jdbc.Driver");

			// Driver driver = new com.mysql.jdbc.Driver();
			// DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(url, userName, password);

		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new DatabaseException("Database Exception", e);
		}
		return con;
	}
}
