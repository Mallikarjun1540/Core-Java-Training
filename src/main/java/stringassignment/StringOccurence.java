package stringassignment;

import java.util.Scanner;
public class StringOccurence {
		private static Scanner sc;
		public static void main(String[] args) {
			String maxOcc;
			char maxChar = ' ';
			int i = 0, j = 0, max = -1;
			int[] charFreq = new int[256];
			
			sc= new Scanner(System.in);
			System.out.print("\nEnter String : ");
			maxOcc = sc.nextLine();
			
			while(i < maxOcc.length())
			{
				charFreq[maxOcc.charAt(i)]++;
				i++;
			}
			while(j < maxOcc.length()) 
			{
				char ch = maxOcc.charAt(j);
				if(max < charFreq[ch]) {
					max = charFreq[ch];
					maxChar = ch;
				}
				j++;
			}
			System.out.println("\nThe Maximum Occurring Character is : " +  maxChar);
			System.out.format("'%c' Character Occurs %d Times ", maxChar, max);	
			
		}
	}

