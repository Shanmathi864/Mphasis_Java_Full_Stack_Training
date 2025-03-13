package Files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerialDemo {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter id:");
		
		int n=sc.nextInt();
		
		System.out.println("Enter Name:");
		
		String m = sc.nextLine();
		
		System.out.println("Enter City:");
		
		String l = sc.nextLine();
		
		System.out.println("Enter Pincode:");
		
		int o = sc.nextInt();
		
		Customer cstobj = new Customer(n, m, l, o);
		
		FileOutputStream fout =null;
		BufferedOutputStream bout = null;
		ObjectOutputStream objout = null;
		try
		{
			fout = new FileOutputStream("src/customer.txt");
			bout = new BufferedOutputStream(fout);
			objout = new ObjectOutputStream(bout);
			objout.writeObject(cstobj);
		}
		catch(Exception e)
		{
			e.printStackTrace();
;		}
		finally
		{
			try
			{
				objout.close();
				bout.close();
				fout.close();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
