package java8;
interface MyInterface
{
	static void display()
	{
		System.out.println("Hello World!");
	}
}
public class StaticMethodDemo implements MyInterface{

	public static void main(String[] args) {
		MyInterface.display();
		
	}

}
