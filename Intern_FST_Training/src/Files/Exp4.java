package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;
import java.nio.file.Paths;

public class Exp4 {

	public static void main(String[] args) throws IOException {
		
		try(Stream<String> strm = Files.lines(Paths.get("src/chartest.txt")))
		{
			strm.forEach(System.out :: println);
			
			List<String> data = strm.filter(str -> str.startsWith("c"))
					.map(String :: toUpperCase).toList();
			
			System.out.println(data);
			
			//Set<PosixFilePermissiom> perm = new HashSet<>();  
		}
	} 

}
