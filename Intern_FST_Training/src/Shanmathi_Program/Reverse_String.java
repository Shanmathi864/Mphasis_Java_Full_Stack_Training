package Shanmathi_Program;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="java";
		String b="";
		char ch;
		for(int i=0;i<a.length();i++)
		{
			ch = a.charAt(i);
			b=ch+b;
		}
		System.out.println(b);
		for(int i=b.length()-1;i>=0;i--)
		{
			System.out.print(b.charAt(i));
		}
		
	}

}
