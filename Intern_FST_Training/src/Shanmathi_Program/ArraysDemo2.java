package Shanmathi_Program;
import java.util.*;
public class ArraysDemo2 {

	public static void main(String[] args) {
		int a[]= {1,2,1,6,3,4,2,4,5,6};
		System.out.print("Before Sorting :");
		for(int i: a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.print("After Sorting :");
		for(int j : a)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[j]+" ");
					c++;
					break;
				}
				
			}
		}
		System.out.println();
		System.out.println(c);
		
		
		
	}
}
