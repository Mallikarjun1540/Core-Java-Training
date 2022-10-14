package stringassignment;



public class StringCompare {

public static void main(String[] args)
    {
        String str1 = "Java developer";
        String str2 = "aython Developer";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
       
        
        int result = str1.compareToIgnoreCase(str2);

        // Display the results of the comparison.
        if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
    }
}