package looping;

import java.util.Scanner;

public class Dowhileloop {

	public static void main(String[] args) {
		int i=1,n,sum=0;
		Scanner scann=new Scanner(System.in);
		System.out.println("Enter the N value");
		n=scann.nextInt();
		do
		{
			sum+=i;
			i++;
		}while(i<=n);
		System.out.println("Sum of first N numbers"+sum);
	}

}
