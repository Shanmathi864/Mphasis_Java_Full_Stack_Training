package Shanmathi_Program_Maps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee
{
	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int yoj;
	private int salary;
	
	public Employee() {
		
	}
	public Employee(int id,String name, int age, String gender, String department,int yoj, int salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.department=department;
		this.yoj=yoj;
		this.salary=salary;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYoj() {
		return yoj;
	}

	public void setYoj(int yoj) {
		this.yoj = yoj;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yoj=" + yoj + ", salary=" + salary + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender() + ", getDepartment()="
				+ getDepartment() + ", getYoj()=" + getYoj() + ", getSalary()=" + getSalary() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}

public class Exp6 {

	public static void getCountOfMaleNFemale(List<Employee> employeeList)
	{
		Map<String, Long> result = employeeList.stream().
				collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
		
		System.out.println(result);
	}
	
	
	public static void getDepartmentNames(List<Employee> employeeList)
{
	employeeList.stream().map(Employee :: getDepartment)
	                     .distinct()
	                     .forEach(System.out :: println);
}

	public static void getAverageGenderAge(List<Employee> employeeList)
	{
		Map<String, Double> avgData = employeeList.stream().
				collect(Collectors.groupingBy(Employee :: getGender, 
						Collectors.averagingInt(Employee :: getAge)));
		
		System.out.println(avgData);
	}
	
	public static void getNameOfEmployees(List<Employee> employeeList)
	{
		employeeList.stream().filter(emp -> emp.getYoj() >2021)
		                     .map(Employee :: getName)
		                     .forEach(System.out::println);
	}
	
	public static void countByDept(List<Employee> employeeList)
	{
		Map<String, Long> cntResult = employeeList.stream()
				.collect(Collectors.groupingBy(Employee :: 
					getDepartment, Collectors.counting()));
		cntResult.forEach((k,v)-> System.out.println(k+" --> "+v));
	}
	
	public static void AverageSalaryOfDept(List<Employee> employeeList)
	{
		Map<String, Double> result = employeeList.stream().
				collect(Collectors.groupingBy(Employee :: getDepartment, 
						Collectors.averagingDouble(Employee :: getSalary)));
		
		result.forEach((k,v) -> System.out.println(k+" ---> "+v));
	}
	
	public static void oldestEmployeeAgeNDept(List<Employee> employeeList)
	{
		Optional<Employee> oldEmp=
				
				employeeList.stream()
				.max(Comparator.comparing(Employee :: getAge));
		
		Employee empData = oldEmp.get();
		
		System.out.println("Name :"+ empData.getName());
		System.out.println("Age :"+ empData.getAge());
		System.out.println("Department :"+ empData.getDepartment());
	}
	
	public static void getAvgNTotalSalaryOfCompany(List<Employee> employeeList)
	{
		DoubleSummaryStatistics empSalResult =
				employeeList.stream().
				collect(Collectors.summarizingDouble(Employee :: getSalary));
		
		System.out.println("Average Salary : "+empSalResult.getAverage());
		System.out.println("Total Salary : "+empSalResult.getSum());
		
	}
	
	public static void listEmpFromEachDept(List<Employee> employeesList)
	{
		Map<String, List<Employee>> empListDept =
				employeesList.stream().collect
				(Collectors.groupingBy(Employee :: 
					getDepartment));
		
		for(String k : empListDept.keySet())
		{
			System.out.println("Department :: "+k);
			
			List<Employee> emp = empListDept.get(k);
			
			for(Employee dt : emp)
			{
				System.out.println(dt);
			}
		}
	}
	
	public static void getSeniorEmployee(List<Employee> employeeList)
	{
		Optional<Employee> seniorEmp=
				
				employeeList.stream()
				.sorted(Comparator.comparing(Employee :: getYoj))
				.findFirst();
		Employee empData = seniorEmp.get();
		
		System.out.println("Senior Employee from the Company :");
		System.out.println("==============================");
		System.out.println("Id :"+ empData.getId());
		System.out.println("Name :"+ empData.getName());
		System.out.println("Age :"+ empData.getAge());
		System.out.println("Department :"+ empData.getDepartment());
	}
	
	public static void main(String[] args) {
		
		List<Employee> employeeList= new ArrayList<Employee>();
		
		employeeList.add(new Employee(111, "Shanmathi", 25, "Female", "HR", 2020, 150000));
		employeeList.add(new Employee(122, "Vanmathi", 25, "Female", "Product Developer", 2021, 100000));
		employeeList.add(new Employee(133, "Arul", 26, "Male", "Designer", 2022, 140000));
		employeeList.add(new Employee(144, "Vaj", 26, "Male", "Developer", 2020, 130000));
		employeeList.add(new Employee(155, "Sahana", 26, "Female", "Developer", 2022, 120000));
		employeeList.add(new Employee(166, "Monesh", 26, "Male", "Designer", 2023, 100000));
		employeeList.add(new Employee(177, "Kiruthika", 24, "Female", "HR", 2021, 140000));
		employeeList.add(new Employee(188, "Gowtham", 25, "Male", "HR", 2021, 150000));
		employeeList.add(new Employee(199, "Seelan", 26, "Male", "Manager", 2024, 150000));
		employeeList.add(new Employee(200, "Irfan", 27, "Male", "Sales", 2025, 100000));
		employeeList.add(new Employee(211, "Praveen", 26, "Male", "Accountant", 2023, 110000));
		employeeList.add(new Employee(222, "Ananth", 27, "Male", "Customer Support", 2023, 100000));
		employeeList.add(new Employee(233, "Sasi", 24, "Male", "infrastructure", 2024, 120000));
		employeeList.add(new Employee(244, "Vasanth", 27, "Male", "Sales Executive", 2023, 130000));
		employeeList.add(new Employee(255, "Saravan", 28, "Male", "Team Lead", 2023, 140000));
		
		/*Exp6.getCountOfMaleNFemale(employeeList);
		Exp6.getDepartmentNames(employeeList);
		Exp6.getAverageGenderAge(employeeList);
		Exp6.getNameOfEmployees(employeeList);
		Exp6.countByDept(employeeList);*/
		//Exp6.AverageSalaryOfDept(employeeList);
		//Exp6.getAvgNTotalSalaryOfCompany(employeeList);
		//Exp6.listEmpFromEachDept(employeeList);
		Exp6.getSeniorEmployee(employeeList);
		
	}

}
