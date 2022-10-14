package strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		System.out.println("Using Constructor 1 - ");
		StringTokenizer str1 = new StringTokenizer("Hello Arjun Good Morning", " ");
		while (str1.hasMoreElements()) {
			System.out.println(str1.nextToken());
		}
		System.out.println("Using Constructor 2 - ");

		StringTokenizer st2 = new StringTokenizer("JAVA : Code : String", ":");
		while (st2.hasMoreTokens()) {

			System.out.println(st2.nextToken());

		}
		System.out.println("Using Constructor 3- ");

		StringTokenizer st3 = new StringTokenizer("JAVA : Code : String", ":", true);

		while (st3.hasMoreTokens()) {

			System.out.println(st3.nextToken());

		}
	}

}
