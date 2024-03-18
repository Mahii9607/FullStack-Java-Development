package com.String;

public class SubString {

	 public static int countSubstringOccurrences(String text, String substring) {
	        int count = 0;
	        int index = text.indexOf(substring);
	        while (index != -1) {
	            count++;
	            index = text.indexOf(substring, index + 1);
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String text = "MaheshMaheshMahesh";
	        String substring = "Mahesh";
	        int occurrences = countSubstringOccurrences(text, substring);
	        System.out.println("Number of occurrences of '" + substring + "' in '" + text + "': " + occurrences);
	    }

}
