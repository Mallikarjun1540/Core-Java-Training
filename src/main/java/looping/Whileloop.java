package looping;

public class Whileloop {

	public static void main(String[] args) {
		int i=1,odd=0,even=0;
		while(i<=50)
		{
			if(i%2==0)
			{
				even+=i;
				
			}
			else
			{
				odd+=i;
				
			}
			i++;
		}
		System.out.println("Even number sum"+even);
		System.out.println("odd number sum"+odd);
		
	}

}
