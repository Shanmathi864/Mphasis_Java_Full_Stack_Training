package Maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Exp2 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2", "root", "root@39");
		
        String sql = "insert into Students values(?, ? ,?)";
		
		PreparedStatement pst = con.prepareStatement(sql);
		
		pst.setInt(1, 101);
		pst.setString(2, "King");
		pst.setString(3, "Cse");
		
		pst.execute();
             
		
		String sql1 ="update student set std_name= ?, std_dept=? where std_id=?";
		
		PreparedStatement pst1 = con.prepareStatement(sql1);
		pst1.setInt(1, 102);
		pst1.setString(2, "Queen");
		pst1.setString(3, "It");
		
		pst.execute();
		
		System.out.println("Done.");
	}

}
