package java8;

import java.util.function.Function;

public class FunctionalDemo1 {
	public static void main(String[] args) {

		int amount = 10;
								// 20  10    10 +10
		Function<Integer, Integer> sum = i -> i + i; 

		Function<Integer, Integer> sq = i -> i * i; 
		
		System.out.println("Sum of a Number "+sum.apply(amount));
		
		System.out.println("Sqyare of a Number"+sq.apply(amount));
						        
		System.out.println(sum.andThen(sq).apply(amount));
		
		System.out.println(sum.compose(sq).apply(amount));
	}								
}