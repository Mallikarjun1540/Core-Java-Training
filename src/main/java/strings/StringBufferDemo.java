package strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("Hello World ");
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		//insrting a string in the middle
		
		String str1=new String(s.toString());
		System.out.println(str1);
		int pos=str1.indexOf("World");
		s.insert(pos,"Guys ");
		System.out.println(s);
		
		//chatAt method
		
		s.setCharAt(6,'-');
		System.out.println("String Now : "+s);
		//append method
		s.append("java Programming");
		System.out.println(s);

	}

}
