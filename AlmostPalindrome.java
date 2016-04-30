/*
 * AlmostPalindrome.java
 * 
 */

import java.util.Scanner;
public class AlmostPalindrome {
	
	public void almost() {
		Scanner keys = new Scanner(System.in);
		
		String input = "JimmanyFrog";
		String getChars = "";
		String theReverse = "";
		System.out.println("Input any string. ('quit' breaks the loop)");
		input = keys.nextLine();
		
		while (!(input.equals("quit"))) {
		
			String firstLetter = input.substring(0,1);
			String theRest = input.substring(1);
			String backTogether = theRest + firstLetter;
			
			for (int q = backTogether.length() -1; q >= 0; q--) {
				getChars = String.valueOf(backTogether.charAt(q));
				theReverse += getChars;				
				}
				if (input.equals(theReverse)) {
					System.out.println("Almost a palindrome!");
					}
				else {
					System.out.println("Not even close!!");
					}
			getChars = "";		
			theReverse = "";
			System.out.println("Enter another string. ('quit' breaks the loop)");
			input = keys.nextLine();	
			}
		}	
	
	public static void main (String args[]) {
		AlmostPalindrome demo = new AlmostPalindrome();
		demo.almost();
			
	}
}

