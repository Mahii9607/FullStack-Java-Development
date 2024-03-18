package com.String;

import java.util.Scanner;

public class All_Vowels_Present {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
	    String input = sc.nextLine();
	    sc.close();
	    
	    if(hasVowels(input)) {
	    	
	    	System.out.println("The String \"" +input + "\" does not contain any vowels.");
	    	
	    }else {
	    	System.out.println("The String \"" +input + "\" + contains vowels.");
	    	
	    }
	}

private static boolean hasVowels(String input) {
	for(char c : input.toCharArray()) {
		if(isVowel(c)) {
			
			return false;
		}
		
	}
	return true;
}


public static boolean isVowel(char c) {
	char lowerCase = Character.toLowerCase(c);
	
	return lowerCase == 'a' || lowerCase == 'e' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'u';

}
}


