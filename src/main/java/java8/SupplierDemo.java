package java8;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {

		Supplier<Double> sup = () -> Math.floor(1.585);
		
		System.out.println(sup.get());
	}
}