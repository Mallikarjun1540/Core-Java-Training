package stringassignment;


import java.util.Scanner;

class Pallindrome
{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner SC = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = SC.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
   }
}