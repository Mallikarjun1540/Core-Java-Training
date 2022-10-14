package collectionframeworkassignments;

import java.util.*;

public class EvenNumbersUsingLinkedList {
	private LinkedList<Integer> A1=new LinkedList<Integer>();
	public LinkedList EvenNumbers(int N)
	{
		 A1=new LinkedList<Integer>();
		for(int i=2;i<=N;i++)
		{
			if(i%2==0)
			{
				A1.add(i);
			}
		}
		System.out.println("LinkedList 1 Elements\n" +A1);
		return A1;
	}

	public LinkedList PrintEvenNumbers()
	{
		LinkedList<Integer> A2=new LinkedList<Integer>();
		System.out.println("\n LinkedList Two Elements with A1*2");
		for(Integer in:A1)
		{
			A2.add(in*2);
			System.out.println(in*2);
		}
		
		
		return A2;
		
		
	}
	public static void main(String[] args) {
		EvenNumbersUsingLinkedList st=new EvenNumbersUsingLinkedList();
		st.EvenNumbers(20);
		//st.EvenNumbers(25);
		//System.out.println(st.PrintEvenNumbers());
		st.PrintEvenNumbers();

	}

}
