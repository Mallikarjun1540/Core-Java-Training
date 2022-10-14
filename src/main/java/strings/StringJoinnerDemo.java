package strings;

import java.util.StringJoiner;

public class StringJoinnerDemo {

	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(",","(",")");
		joinNames.add("Arjun");
		joinNames.add("Praveen");
		joinNames.add("Amith");
		joinNames.add("Mallikarjun");
		System.out.println(joinNames);

	}

}
