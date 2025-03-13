package Files;

import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exp2 {

	public static void main(String[] args) {
		
		Path srcpath = Paths.get("src/bytetest.txt");
		Path trgtpath = Paths.get("src/chartest.txt");
		
		try
		{
			Path path = Files.copy(srcpath, trgtpath, StandardCopyOption.REPLACE_EXISTING);
			
			System.out.println("Target file Location : "+ path);
			
			System.out.println("Copied content : "+new String(Files.readAllBytes(path)));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
