package com.String;

import java.util.Scanner;

public class Remove_Specific {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();

	        // Character to remove
	        System.out.println("Enter the character to remove:");
	        char charToRemove = scanner.nextLine().charAt(0);
	        scanner.close();

	        
	        String result = removeCharacter(input, charToRemove);

	       
	        System.out.println("Result after removing '" + charToRemove + "':");
	        System.out.println(result);
	    }

	    public static String removeCharacter(String input, char charToRemove) {
	        
	        StringBuilder sb = new StringBuilder();

	        
	        for (char c : input.toCharArray()) {
	           
	            if (c != charToRemove) {
	                sb.append(c);
	            }
	        }

	      
	        return sb.toString();
	    }
}
