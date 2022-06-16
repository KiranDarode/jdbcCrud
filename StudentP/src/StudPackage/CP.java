package StudPackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static Connection con;
	
	public static Connection CreateC() {
		
		
		try {
			
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			String user="root";
			String password="";
			String url="jdbc:mysql://localhost:3306/student_m";
			
			con=DriverManager.getConnection(url, user,password );
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return con;
		
	}

//	public static Connection CreateC() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
