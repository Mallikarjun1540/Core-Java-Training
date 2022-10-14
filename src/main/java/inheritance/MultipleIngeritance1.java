package inheritance;

class A  //Base class
{
	void dog()
	{
		System.out.println("Dog is Eating");
	}
}

interface B
{
	final int a=10;
	void cat();
}	

interface D
{
	final int a=20;
}

class C extends A implements B,D
{

	@Override
	public void cat() {
		System.out.println("Cat is Walking");
		System.out.println("first interface variable value "+B.a);
		System.out.println("second interface variable value "+D.a);
		
		
	}
	
}
public class MultipleIngeritance1 {

	public static void main(String[] args) {
		C c=new C();
		c.dog();
		c.cat();

	}

}
