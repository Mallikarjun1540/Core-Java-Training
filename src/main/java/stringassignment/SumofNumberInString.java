package stringassignment;


import java.util.*;
public class SumofNumberInString
{
public int sumOfTheNumbers(String stng) 
{
  int l = stng.length();
  int sum = 0;
  String temp = "";
  for (int i = 0; i < l; i++) 
  {
    if (Character.isDigit(stng.charAt(i))) 
	{
      if (i < l-1 && Character.isDigit(stng.charAt(i+1))) 
	  {
        temp += stng.charAt(i);
      }
      else 
	  {
        temp += stng.charAt(i);
        sum += Integer.parseInt(temp);
        temp = "";
      }
    }
  }
  return sum;
}

public static void main (String[] args)
    {
	SumofNumberInString m= new SumofNumberInString();
      String str1 =  "it 15 is25 a 60string";
      System.out.println("The given string is: "+str1);
      System.out.println("The sum of numbers in the string is: "+m.sumOfTheNumbers(str1));
	  }
}