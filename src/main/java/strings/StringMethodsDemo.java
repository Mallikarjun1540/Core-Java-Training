package strings;

public class StringMethodsDemo {

	public static void main(String[] args) {
		
		String s="Hello";
		String s1="  World     ";
		String s2="My Name is Arjun";
		String s3="Hello";
		//Length method
		System.out.println("Length of string s  "+s.length());
		
		//Replace Method
		System.out.println("Replace of H to W  "+s.replace('H','W'));
		
		//toLowecase Method
		
		System.out.println(s.toLowerCase());
		
		//toUppercase method
		
		System.out.println(s.toUpperCase());
		
		//trim Method
		System.out.println(s1);
		System.out.println(s1.trim());
		
		//split Method
		String str[]=s2.split(" ");
		for(int i=0;i<str.length;i++)
		{
		System.out.println(str[i]);
		}
		
		//endswith method
		System.out.println(s.endsWith("lo"));
		System.out.println(s.endsWith("l"));
		
		//startswith method
		System.out.println(s.startsWith("He"));
		System.out.println(s.startsWith("h"));
		
		//Substring Method
		
		System.out.println(s2.substring(5));
		System.out.println(s2.substring(5,9));
		
		//compareTo Method
		
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s3));
		System.out.println(s1.compareTo(s));
		
		//Indexof Method
		
		System.out.println(s.indexOf('l'));
		System.out.println(s.indexOf('o'));
		
		//LastIndexof Method
		
		System.out.println(s.lastIndexOf('l'));
		System.out.println(s.lastIndexOf('o'));
		
	}

}
