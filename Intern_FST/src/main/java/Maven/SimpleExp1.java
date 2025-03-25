package Maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleExp1 {
	
	public static void main(String[] args){
		
		try
		{
			//1. Load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//2.Create Connection Object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "root@39");
			
			//3. Create statement Object
			Statement stmt =con.createStatement();
			
			//SQL query
			//String sql = "create table students(id int, name varchar(50), email varchar(100));";
			//String sql ="insert into movies values(101, 'king', 2140)";
			
			/*Student std = new Student(100, "Shanmathi", "shan@gmail.com");
			
			Student std1 = new Student(101, "Vanmathi", "Van@gmail.com");
		
			
			String sql = "create table students(id int, name varchar(50), email varchar(100));"
				+ "insert into students value("+std.getId()+", '"+std.getName()+"', '"
				+std.getEmail()+"');";
			String sql2="insert into students value("+std1.getId()+", '"+std1.getName()+"', '"
				+std1.getEmail()+"');";
			*/
			 String sql = "select * from student";
			 
			 ResultSet rs = stmt.executeQuery(sql);
			 
			 while(rs.next())
			 {
				 System.out.print("Id");
			 }
			 
			//4.execute query
			stmt.execute(sql);
			
			//5.close the connection Object
			//con.close();
			
			System.out.println("Done.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
