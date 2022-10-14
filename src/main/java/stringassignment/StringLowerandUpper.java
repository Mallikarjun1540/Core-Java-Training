package stringassignment;

import java.util.Scanner;

public class StringLowerandUpper {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First String");
		String a=scan.next();
		System.out.println("String in Upper case\n"+a.toUpperCase());
		System.out.println("String in Lower case\n"+a.toLowerCase());
		
	}

}
