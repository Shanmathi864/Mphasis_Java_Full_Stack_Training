package junit_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Simple_java {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/project2";
		String username = "root";
		String password = "root@39";
		
		
		try {
			Class.forName("co,.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username, password);
			Statement stmt = con.createStatement();
			String sql1 = "insert into students values(101, 'Vanmathi', 'Cse')";
			String sql2 = "insert into students values(102, 'Sahana', 'It')";
			String sql3 = "insert into students values(103, 'Arul', 'Cse')";
			
			stmt .addBatch(sql1);
			stmt .addBatch(sql2);
			stmt .addBatch(sql3);
			
			stmt.executeBatch();
			
			String sql11 = "inset into students values(?, ?, ?)";
			
			PreparedStatement pst = con.prepareStatement(sql1);
			
			pst.setInt(1, 90);
			pst.setString(2, "Ananth");
			pst.setString(3, "ECE");
			
			pst.addBatch();
			
			pst.execute();
			
            String sql12 = "inset into students values(?, ?, ?)";
			
			PreparedStatement pst1 = con.prepareStatement(sql1);
			
			pst1.setInt(1, 90);
			pst1.setString(2, "Sherin");
			pst1.setString(3, "TXT");
			
			pst1.addBatch();
			
			pst1.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
