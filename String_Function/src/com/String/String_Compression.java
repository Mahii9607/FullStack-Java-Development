package com.String;

public class String_Compression {
	   
	public static String compressString(String input) {
	        if (input == null || input.isEmpty()) {
	            return input;
	        }

	        StringBuilder compressed = new StringBuilder();
	        char prevChar = input.charAt(0);
	        int count = 1;

	        for (int i = 1; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            if (currentChar == prevChar) {
	                count++;
	            } else {
	                compressed.append(prevChar);
	                compressed.append(count);
	                prevChar = currentChar;
	                count = 1;
	            }
	        }
           
	        compressed.append(prevChar);
	        compressed.append(count);

	        // Check if the compressed string is shorter than the original
	        return compressed.length() < input.length() ? compressed.toString() : input;
	    }

	    public static void main(String[] args) {
	        String input = "MMahheeeeessshhhhhhhhh";
	        System.out.println("Original String: " + input);
	        System.out.println("Compressed String: " + compressString(input));
	    }
	}


