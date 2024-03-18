package com.String;

public class Split_join {

	public static void main(String[] args) {
        String sentence = "This is a sample sentence";
        
        // Splitting the string into words
        String[] words = sentence.split(" ");

        // Joining the words back into a string
        String joinedString = String.join(" ", words);

        // Printing the original and joined string
        System.out.println("Original String: " + sentence);
        System.out.println("Joined String: " + joinedString);
    }
}
