package Shanmathi_Program_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Book
{
	private int id;
	
	private String name;
	
	private  String author;
	
	public Book()
	{
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}



public class Exp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, List<Book>> bookData = new HashMap<>();
		
		List<Book> bdata1 =new ArrayList<>();
		
		bdata.add(new Book(101, "Titanic", "RoseJack"));
		bdata.add(new Book(102, "It", "Joker"));
		
		List<Book> bdata2 = new ArrayList<>();
		
		bdata.add(new Book(101, "After", "hardin"));
		bdata.add(new Book(101, "Myfault", "NickNova"));
		
        List<Book> bdata3 = new ArrayList<>();
		
		bdata.add(new Book(101, "After We Fell", "Tessa  "));
		bdata.add(new Book(101, "Yourfault", "NoahNick"));
		
		bookData.put("Software", bdata1);
		bookData.put("Hardware", bdata2);
		bookData.put("Framework", bdata3);
	}

}
