package com.String;

import java.util.Scanner;

public class Reverse_WordsIN_Sentence {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter a sentence:");
	        String sentence = scanner.nextLine();
	        scanner.close();

	        
	        String reversedSentence = reverseWords(sentence);

	      
	        System.out.println("Original sentence: " + sentence);
	        System.out.println("Reversed sentence: " + reversedSentence);
	    }

	    public static String reverseWords(String sentence) {
	       
	        String[] words = sentence.split("\\s+");
	        
	       
	        StringBuilder reversedSentence = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversedSentence.append(words[i]).append(" ");
	        }
	        
	       
	        return reversedSentence.toString().trim();
	    }

}
