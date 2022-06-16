package StudPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.BreakIterator;

public class Studio {
	
	
	public static boolean insertDio(Student st) {
		boolean f=true;
		try {
		Connection con=CP.CreateC();
		
		String q="insert into students (sname,sphone,scity) values(?,?,?)";
		
		PreparedStatement pstmt=con.prepareStatement(q);
		
		
		pstmt.setString(1, st.getName());
		
		pstmt.setString(2, st.getPhone());
		
		pstmt.setString(3, st.getCity());
		
		pstmt.executeUpdate();
		
		f=true;
	
		
		
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return f;
		
	}

	public static boolean DeleteDioStud(int userId) {
		boolean f=true;
		
		try {
			Connection con=CP.CreateC();
			
			// fire qurey
			
			String q="delete from students where sid=?";
			
			//if you pass args then we use only preparedStatment
			
			PreparedStatement pstmt=con.prepareStatement(q);

			pstmt.setInt(1,userId);
			f=true;
			
			pstmt.executeUpdate();
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
		
		
		
		return f;
		
		
		
	}

	public static void ShowAllState() {
		// TODO Auto-generated method stub
		try {
			Connection con=CP.CreateC();
			
			// fier the show all qurey
			
			String q="select * from students";
			
			Statement stat=con.createStatement();
		     ResultSet set=stat.executeQuery(q);
		     while(set.next()) {
		    	 
		    	 int id=set.getInt(1);
		    	 String name=set.getString(2);
		    	 String phone=set.getString(3);
		    	 String city=set.getString(4);
		    	 
		    	 System.out.println("======================================");
		    	 System.out.println("id :"+id);
		    	 System.out.println("name :"+name);
		    	 System.out.println("phone:"+phone);
		    	 System.out.println("city :"+city);
		    	 System.out.println("============++++++++====================");
		    	 
		     }
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
