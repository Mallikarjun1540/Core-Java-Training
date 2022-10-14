package java8;
interface Square
{
	int calculate(int x);
}
public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
		Square s=(int x)->x*x;
		
		int r=s.calculate(5);
		System.out.println("Square of a number is "+r);

	}

}
