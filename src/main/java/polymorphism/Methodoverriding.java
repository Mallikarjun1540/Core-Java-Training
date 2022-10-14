package polymorphism;

class Animal {
	int a=40;
	public void move() {
		System.out.println("Animals can move");
	}
	void display()
	{
		System.out.println("Display method in parent class");
	}
}

class Dog extends Animal {
	public void move() {
		super.move();
		System.out.println("Dogs can walk and run");
		super.a=10;
		System.out.println("value of a is "+super.a);
	}
	void display1()
	{
		System.out.println("Display method in child class");
	}
}
public class Methodoverriding {

	public static void main(String[] args) {
		Animal a=new Dog();
		Dog b = new Dog();
		b.move(); 
		b.display();
		//a.display();
		b.display1();
		//a.move();
		
	}

}
