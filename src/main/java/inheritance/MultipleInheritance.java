package inheritance;

interface Fox
{
	public void eat();
	public void sleep();
	final String animal="Fox";
}
interface Dog
{
	public void bark();
	public void sleep();
	final String animal="Dog";
}
class Cat
{
	void walk()
	{
		System.out.println("Cat is Walking");
		
	}
}
class Animal extends Cat implements Fox,Dog
{
	//System.out.println("Animal Name is "+Fox.animal);
	//System.out.println("Animal Name is "+Dog.animal);
	
	@Override
	public void bark() {
		System.out.println("Dog is Barking");
		System.out.println("Animal Name is "+Dog.animal);
		
	}

	@Override
	public void eat() {
		System.out.println("Fox is Eating");
		System.out.println("Animal Name is "+Fox.animal);
		
	}

	@Override
	public void sleep() {
		System.out.println("Fox is sleeping");
		
	}
	
	
}

public class MultipleInheritance{

	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		a.bark();
		a.walk();
		a.sleep();

	}

}
