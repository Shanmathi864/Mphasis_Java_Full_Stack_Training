package Shanmathi_Program_MLA_Training_Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Orders
{
	
    private int id;
	
	private String Name;
	
	private int price;
	
	private String Month;
	
	private int year;
	
	private String City;
	
	private String Category;
	
	private int Qty;
	
	public Orders(int i, String string, int j, String string2, int k, String string3, String string4, int l) {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMonth() {
		return Month;
	}

	public void setMonth(String month) {
		Month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public int getQty() {
		return Qty;
	}

	public void setQty(int qty) {
		Qty = qty;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", Name=" + Name + ", price=" + price + ", Month=" + Month + ", year=" + year
				+ ", City=" + City + ", Category=" + Category + ", Qty=" + Qty + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + ", getMonth()=" + getMonth() + ", getYear()=" + getYear()
				+ ", getCity()=" + getCity() + ", getCategory()=" + getCategory() + ", getQty()=" + getQty()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
	
public class Orders_Placed {

	public static void main(String[] args) {
		

		//1 to find the highest Qty order
		public static void getHighestQuantity(List<Orders> orderList) 
		{
			Optional<Orders> highestOrders = orderList.stream().max(Comparator.comparing(Orders :: getQty));
			Orders hghOrd = highestOrders.get();
			System.out.println("The Highest Order Quantity : ");
			System.out.println("====================");
			System.out.println("ID : "+hghOrd.getId());
			System.out.println("Name : "+hghOrd.getName());
			System.out.println("Category : "+hghOrd.getCategory());
			System.out.println("Price : "+hghOrd.getPrice());
			System.out.println("Quantity : "+hghOrd.getQty());
		
		}
	
		
		List<Orders> orderList= new ArrayList<Orders>();


		orderList.add(new Orders(101,"Shan",450,"Feb",2021,"Neyveli","Cake",3));

		orderList.add(new Orders(110,"Mathi",900,"Nov",2024,"Chennai","Chocolate",10));

		orderList.add(new Orders(141,"Kishore",320,"Oct",2021,"Neyveli","Cookies",20));

		orderList.add(new Orders(123,"kavin", 420, "Nov", 2022, "Chennai", "SoftDrinks", 2));

		orderList.add(new Orders(165,"Sahana",380,"Sept",2009,"Mumbai","Bicuits",6));

		orderList.add(new Orders(137,"Vanu",310,"Apr",2007,"Hyderabad","Biscuits",8));

		orderList.add(new Orders(139,"Suba",950,"Sept",2006,"Villupuram","Cake",8));

		orderList.add(new Orders(138,"Oviya",630,"Apr",2008,"Delhi","Bicuits",3));

	}

}
