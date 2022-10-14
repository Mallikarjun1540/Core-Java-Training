package strings;

public class StringequalsDemo {

	public static void main(String[] args) {
		String s="Hello";
		String s1="  World     ";
		String s2=new String("hello");
		String s3="Hello";
		
		System.out.println("Demonstration of Equals method");
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		
		System.out.println("Demonstration of == Operator");
		
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s==s3);
		
		System.out.println("Demonstration of EqualsIgnoreCase method");
		
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.equalsIgnoreCase(s1));
		
	
		
	}

}
