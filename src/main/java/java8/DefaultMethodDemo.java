package java8;

interface TestInterface {
	public void square(int a);

	default void show() {
		System.out.println("Default Method Executed");
	}
}

class DefaultMethodDemo implements TestInterface {
	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		DefaultMethodDemo d = new DefaultMethodDemo();

		d.square(10);

		d.show();
	}
}