package Shanmathi_Program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExp1 {

	public static void main(String[] args) {
		
		Pattern formatD = Pattern.compile(".s");
		
		Matcher matchD = formatD.matcher("bs");
		
		boolean b = matchD.matches();
		
		System.out.println(b);
		
		boolean b1 = Pattern.compile(".s").matcher("as").matches();
		
		boolean b2 = Pattern.matches(".s", "sm");
		
		System.out.println(b1);
		
		System.out.println(b2);
		
		System.out.println(Pattern.matches("[a-z]", "abc"));
		
		System.out.println(Pattern.matches("[9]{1}[0-9]{9}", "9047992753"));
		
	}
	
	public boolean validEmail(String email)
	{
		boolean validateEmail = Pattern.matches(
				"[_a-zA-Z0-9]+(\\.[A-Za-z0-9]*)*@[a-zA-Z0-9]+(\\.[A-Za-z0-9]*)*","Shanmathi.babu8@gmail.com");
		
		return validateEmail;
	}
	
	public boolean validDatePassword(String password)
	{
		
		String patternP ="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$).{12,}";
		
		boolean passwordValidate = Pattern.matches(patternP, password);
		
		return passwordValidate;
	}
}
