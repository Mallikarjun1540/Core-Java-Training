package collectionframeworkassignments;

import java.util.*;

public class IntegerArraylist {
	ArrayList<Integer> ar2=new ArrayList<Integer>();
	public ArrayList<Integer> getData1()
	{
		int n;
		int a;
		ar2.add(100);
		ar2.add(40);
		ar2.add(15);
		ar2.add(52);
		//ar2.add("Arjun");
		ar2.add((int) 0.9);
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the Number of elemens you want to enter into the list");
		n=scan.nextInt();
		System.out.println("Enter the "+n+" Elements");
		for(int i=1;i<=n;i++)
		{
			a=scan.nextInt();
			
			ar2.add(a);
		}
		
		return ar2;
		
		
	}
	public ArrayList<Integer> printAll1()
	{
		System.out.println(ar2);
		return ar2;
		
	}
	public static void main(String[] args) {
		IntegerArraylist s1=new IntegerArraylist();
		s1.getData1();
		s1.printAll1();
		
	}

}
