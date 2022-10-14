package collectionframeworkassignments;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {

	ArrayList<String> ar1=new ArrayList<String>();
	public ArrayList<String> getData()
	{
		int n;
		String str;
		ar1.add("Arjun");
		ar1.add("Deepa");
		//ar1.add(10);
		ar1.add("Praveen");
		ar1.add("Amith");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the Number of elemens you want to enter into the list");
		n=scan.nextInt();
		System.out.println("Enter the "+n+" Elements");
		for(int i=1;i<=n;i++)
		{
			str=scan.next();
			
			ar1.add(str);
		}
		
		return ar1;
		
		
	}
	public ArrayList<String> printAll()
	{
		System.out.println(ar1);
		return ar1;
		
	}
	public static void main(String[] args) {
		StringArrayList s1=new StringArrayList();
		s1.getData();
		s1.printAll();
	}

}
