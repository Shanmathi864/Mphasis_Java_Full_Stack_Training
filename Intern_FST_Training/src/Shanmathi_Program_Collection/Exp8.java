package Shanmathi_Program_Collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Book implements Comparable<Book>
{
	private int id;
	 
	private String name;
	
	private String Author;
	
	private int price;
	
	public Book()
	{
		
	}
	
	public Book(int id,String name,String Author, int price)
	{
		this.id=id;
		this.name= name;
		this.Author=Author;
		this.price=price;
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
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Author, id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(Author, other.Author) && id == other.id && Objects.equals(name, other.name)
				&& price == other.price;
	}

	@Override
	public int compareTo(Book o) {
		return this.id -o.id;
	}

	
	 
}

class NameComparator1 implements Comparator<Book>
{
	
	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
}

public class Exp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Book> data =new TreeSet<>(new NameComparator1());
		
		data.add(new Book(101, "Cricket", "Rohit", 123));
		data.add(new Book(102, "Dargon", "Arshath", 124));
		data.add(new Book(103, "Charm", "Ammul", 125));
		data.add(new Book(104, "base", "Ram", 126));
		data.add(new Book(105, "Sam", "amal", 127));
		data.add(new Book(106, "Rose", "gopal", 128));
		
		System.out.println(data);
		
		data.forEach(book -> System.out.println(book.getId()+" "+book.getName()+" "+book.getAuthor()+" "+book.getPrice()+" "));
		
		System.out.println("Below 125                                                                      ");
		data.parallelStream()
		.filter(bk -> bk.getPrice() <125)
		.forEach(book -> System.out.println(book.getId()+" "+
		book.getName()+" "+book.getPrice()+" "+book.getAuthor()));
	}

}
