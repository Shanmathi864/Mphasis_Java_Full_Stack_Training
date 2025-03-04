package Shanmathi_Program;
import java.util.Scanner;
public class Administration_Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        String d=sc.nextLine();
        String e=sc.nextLine();
        int x=sc.nextInt();
        int y=sc.nextInt();
        Float z=sc.nextFloat();
        System.out.println("College Allotment Order");
        System.out.println("***********************************************");
        System.out.println("Candidate Name:"+a);
        System.out.println("College Name:"+b);
        System.out.println("Entrance Test Rank: "+x);
        System.out.println("Branch: "+c);
        System.out.println("Date Of Joining: "+y);
        System.out.println("Address: "+d);
        System.out.println("CGPA: "+z);
        System.out.println("University: "+e);
        System.out.println("***********************************************");
        if(z>=4.00 || z<6.00){
            System.out.println("The Candidate is Eligible for only Tire-3 University and Colleges.");
            System.out.println("The Candidate Applicable for Round-3");
        }
        else if(z>=6.00 || z<7.50)
        {
            System.out.println("The Candidate is Eligible for only Tire-2 University and Colleges.");
            System.out.println("Congratulatio! The Candidate Applicable for Round-2");
        }
        else if(z>=7.50 || z==10.00)
        {
            System.out.println("The Candidate is Eligible for only Tire-1 University and Colleges.");
            System.out.println("Congratulatio! The Candidate Applicable for Round-1");
        }
        else{
            System.out.println("Congratulatio! The Candidate is Not fit for Any College.");
        }
    }
	}


