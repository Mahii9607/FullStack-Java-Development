package com.String;

import java.util.Arrays;

public class Sorting_String {

	public static String sortString(String input) {
		 char[] charArray = input.toCharArray();
		 
		 Arrays.sort(charArray);
		 
		 String sortedString = new String(charArray);
		 
		 return sortedString;
	}

	
	public static void main(String[] args) {
		
		String  inputString = "Mahesh";
		String sortedString = sortString(inputString);
		
		System.out.println("Original String: " +inputString);
		System.out.println("Sorted String: "+sortedString);
	}
}
