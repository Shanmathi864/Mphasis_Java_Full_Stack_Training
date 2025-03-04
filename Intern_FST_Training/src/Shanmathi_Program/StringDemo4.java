package Shanmathi_Program;

public class StringDemo4 {

	public static void main(String[] args) {
		                
		StringBuffer str =new StringBuffer("java");
		str.append(" 23");
		System.out.println(str);
		System.out.println(str.substring(1,3));
		String str2 ="hello";
		StringBuffer str1=new StringBuffer(str);
		System.out.println(str1.reverse());
	}

}
