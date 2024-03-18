package com.String;

public class Addition_String {

	 public static void main(String[] args) {
	        String input = "Java4By2Ki7ran";
	        int sum = sumOfDigits(input);
	        System.out.println("Result: " + sum);
	    }

	    public static int sumOfDigits(String input) {
	        int sum = 0;
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (Character.isDigit(c)) {
	                sum += Character.getNumericValue(c);
	            }
	        }
	        return sum;
	    }
}
