import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Wrapper;

public class Connector {
	
	public static  Connection getConnection() throws ClassNotFoundException {
		Connection con=null;
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/Hostel";
			String user = "root";
			String password = "";
			//register your driver
			Class.forName(driver);
			//create a connection
			con = DriverManager.getConnection(url, user, password);
			//close connection	
			
		}catch(SQLException e) {}
		return con;
	}

}
