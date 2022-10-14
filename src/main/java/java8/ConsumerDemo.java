package java8;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {

		Consumer<String> con = s -> System.out.println(s.toUpperCase());
		
		Consumer<String> con1 = s -> System.out.println( s.toLowerCase() );
		
		con.accept("Hello World");
		con1.accept("ARJUN");;
	}
}