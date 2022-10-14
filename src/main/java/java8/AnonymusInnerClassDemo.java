package java8;
interface Demo
{
	public void eat();
	public void bark();
}
public class AnonymusInnerClassDemo {

	public static void main(String[] args) {
		Demo d=new Demo()
				{

					@Override
					public void eat() {
						System.out.println("Dog is Eating");
						
					}

					@Override
					public void bark() {
						System.out.println("Dog is Barking");
						
					}
				
				};
				d.eat();
				d.bark();
	}

}
