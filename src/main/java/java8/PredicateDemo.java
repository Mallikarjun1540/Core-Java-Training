package java8;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		Predicate<Integer> even = x -> x % 2 == 0;
		
		Predicate<Integer>grt=y->y>5;
		
		for (int i : num) {
			if (grt.and(even).test(i)) {
				System.out.println(i);
			}
		}
	}
}