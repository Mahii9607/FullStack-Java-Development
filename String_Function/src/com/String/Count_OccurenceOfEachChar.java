package com.String;

public class Count_OccurenceOfEachChar {

	public static void main(String[] args) {
		String str = "Hello Mahesh!";
		countOccurence(str);
	}
	
	public static void countOccurence(String str) {
		
		int[] charCount = new int[250];
		
		
		for(int i = 0 ; i < str.length(); i++) {
			charCount[str.charAt(i)]++;
		}
		
		
		System.out.println("Occurrences of each character in the string:");
		
		for(int i = 0 ; i < charCount.length; i++) {
			
			if(charCount[i] != 0) {
				System.out.println((char) i + ": " + charCount[i]);
			}
		}
	
		
		
	}

}
