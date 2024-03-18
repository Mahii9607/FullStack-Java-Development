package com.String;
import java.util.HashSet;
import java.util.Set;
public class Remove_Duplication {
	


	    public static String removeDuplicates(String str) {
	       
	        Set<Character> uniqueChars = new HashSet<>();
	        StringBuilder result = new StringBuilder();

	       
	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            
	            if (!uniqueChars.contains(currentChar)) {
	                result.append(currentChar);
	                uniqueChars.add(currentChar);
	            }
	        }
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String input = "Mahesh";
	        String output = removeDuplicates(input);
	        System.out.println("Original string: " + input);
	        System.out.println("String with duplicates removed: " + output);
	    }
	}


