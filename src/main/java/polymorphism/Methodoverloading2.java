package polymorphism;

class Add {
	static int add(int a, int b)
	{
		return a + b;
	}
	static double add(double a, double b)
	{
		return a + b;
	}
}
public class Methodoverloading2 {
	public static void main(String[] args) {
		System.out.println(Add.add(25,85));
		System.out.println(Add.add(3.142,12.6));

	}

}
