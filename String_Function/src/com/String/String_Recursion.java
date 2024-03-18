package com.String;

public class String_Recursion {

	 public static String reverseString(String str) {
	        
	        if (str == null || str.length() <= 1) {
	            return str;
	        }
	       	        return reverseString(str.substring(1)) + str.charAt(0);
	    }

	    public static void main(String[] args) {
	      
	        String original = "Mahii";
	        String reversed = reverseString(original);
	        System.out.println("Original string: " + original);
	        System.out.println("Reversed string: " + reversed);
	    }

}
