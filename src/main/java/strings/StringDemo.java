package strings;

public class StringDemo {

	public static void main(String[] args) {
		
			// 	  0123456789
		String s="Mallikarjun";
		System.out.println(s);
		char c[]= {'a','r','j','u','n'};
		
		String s1=new String(c);
		System.out.println(s1);
		String s2=new String(c,2,3);
		System.out.println(s2);
		
		
		System.out.println("Charecter at position 3 is "+s.charAt(3));
		System.out.println("Concatination of String s and s1 "+s.concat(s1));
		
	}

}
