package stringassignment;

import java.util.Scanner;

public class CompareIgnore {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First String");
		String a=scan.next();
		System.out.println("Enter Second String");
		String b=scan.next();
		if(a.compareToIgnoreCase(b)==0)
		{
			System.out.println("Two String are Same Ignoring the case of the String");
		}
		else
		{
			System.out.println("Two String are not Same");
		}
	}

}
