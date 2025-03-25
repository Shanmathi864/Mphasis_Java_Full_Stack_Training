package Maven;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exp3 {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub

        Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2", "root", "root@39");
		
		CallableStatement cst = con.prepareCall("{call readData}");
		
		ResultSet rs =cst.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
	}

}
