package junit_maven;

public class Student {

	private int rollno;
	
	private String stdName;
	
	private Double percentage;

	public Student(int rollno, String stdName, Double percentage) {
		super();
		this.rollno = rollno;
		this.stdName = stdName;
		this.percentage = percentage;
	}
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	
	
	
}
