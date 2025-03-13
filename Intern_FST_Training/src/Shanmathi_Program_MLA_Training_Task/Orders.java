package Shanmathi_Program_MLA_Training_Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
class Order{
	
	private int id;
	
	private String Name;
	
	private int price;
	
	private String Month;
	
	private int year;
	
	private String City;
	
	private String Category;
	
	private int Qty;
	
	public Order() {
		
	}
	public Order(int id,String Name,int price,String Month,int year,String City,String Category,int Qty) 
	{
		
		this.id=id;
		this.Name=Name;
		this.price=price;
		this.Month=Month;
		this.year=year;
		this.City=City;
		this.Category=Category;
		this.Qty=Qty;
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
		return "Order [id=" + id + ", Name=" + Name + ", price=" + price + ", Month=" + Month + ", year=" + year
				+ ", City=" + City + ", Category=" + Category + ", Qty=" + Qty + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Category, City, Month, Name, Qty, id, price, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(Category, other.Category) && Objects.equals(City, other.City)
				&& Objects.equals(Month, other.Month) && Objects.equals(Name, other.Name) && Qty == other.Qty
				&& id == other.id && price == other.price && year == other.year;
	}

}
public class Orders {
	//1 to find the highest Qty order
			public static void getHighestQuantity(List<Order> OrderInfo) {
				Optional<Order> highestOrder = OrderInfo.stream().max(Comparator.comparing(Order :: getQty));
				Order hghOrd = highestOrder.get();
				System.out.println("The Highest Order Quantity : ");
				System.out.println("====================");
				System.out.println("ID : "+hghOrd.getId());
				System.out.println("Name : "+hghOrd.getName());
				System.out.println("Category : "+hghOrd.getCategory());
				System.out.println("Price : "+hghOrd.getPrice());
				System.out.println("Quantity : "+hghOrd.getQty());
			}
			
			//2 to find out category wise orders
			public static void getCategorywiseOrder(List<Order> OrderInfo) {
				Map<String, List<Order>> ctgOrd = OrderInfo.stream().collect(Collectors.groupingBy(Order :: getCategory));
				for(String k : ctgOrd.keySet()) {
					System.out.println("Category :: "+k);
					List<Order> ctg = ctgOrd.get(k);
					for(Order ct : ctg) {
						System.out.println(ct);
					}
				}
			}
			
			
		public static void main(String[] args) {
			List<Order> OrderInfo=new ArrayList<Order>();
		      OrderInfo.add(new Order(101,"Shan",450,"Feb",2021,"Neyveli","Cake",3));
		      OrderInfo.add(new Order(110,"Mathi",900,"Nov",2024,"Chennai","Chocolate",10));
		      OrderInfo.add(new Order(141,"Kishore",320,"Oct",2021,"Neyveli","Cookies",20));
		      OrderInfo.add(new Order(132,"Saja",730,"Jan",2022,"Pune","Cake",5));
		      OrderInfo.add(new Order(165,"Sahana",380,"Sept",2009,"Mumbai","Bicuits",6));
		      OrderInfo.add(new Order(137,"Vanu",310,"Apr",2007,"Hyderabad","Biscuits",8));
		      OrderInfo.add(new Order(139,"Suba",950,"Sept",2006,"Villupuram","Cake",8));
		      OrderInfo.add(new Order(138,"Oviya",630,"Apr",2008,"Delhi","Bicuits",3));
		      
		      Orders.getHighestQuantity(OrderInfo);
		      System.out.println();
		      Orders.getCategorywiseOrder(OrderInfo);
		      System.out.println();
		      
		}
}
