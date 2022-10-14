package abstractclassandmethod;

abstract class Student
{
	
	abstract void name();
	void marks()
	{
		int marks1=90;
		int marks2=85;
		System.out.println("Marks1 is "+marks1);
		System.out.println("Marks2 is "+marks2);
		
	}
}
class Display extends Student
{
	String name;
	@Override
	void name() 
	{
		name="Arjun";
		System.out.println("Name is "+name);
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		Display d=new Display();
		d.name();
		d.marks();

	}

}
