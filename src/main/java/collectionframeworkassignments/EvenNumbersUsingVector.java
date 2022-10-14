package collectionframeworkassignments;





import java.util.*;

public class EvenNumbersUsingVector {
	private Vector<Integer> A1=new Vector<Integer>();
	public Vector EvenNumbers(int N)
	{
		 A1=new Vector<Integer>();
		for(int i=2;i<=N;i++)
		{
			if(i%2==0)
			{
				A1.add(i);
			}
		}
		System.out.println("Vector 1 Elements\n" +A1);
		return A1;
	}

	public Vector PrintEvenNumbers()
	{
		Vector<Integer> A2=new Vector<Integer>();
		System.out.println("\n Vector Two Elements with A1*2");
		for(Integer in:A1)
		{
			A2.add(in*2);
			System.out.println(in*2);
		}
		
		
		return A2;
		
		
	}
	public static void main(String[] args) {
		EvenNumbersUsingVector st=new EvenNumbersUsingVector();
		st.EvenNumbers(2);
		//st.EvenNumbers(25);
		//System.out.println(st.PrintEvenNumbers());
		st.PrintEvenNumbers();

	}

}
