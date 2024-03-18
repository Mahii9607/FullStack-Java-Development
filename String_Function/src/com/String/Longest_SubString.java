package com.String;
import java.util.HashMap;
import java.util.Map;

public class Longest_SubString {

	public static int lengthOfLongestSubString(String s) {
		if(s == null || s.length() == 0) {
		return 0;
		}
		

	Map<Character,Integer> map = new HashMap<>();
	int maxLength = 0;
	int start =0;
	
	for(int end = 0; end <s.length();end++){
		char currentChar = s.charAt(end);
		
		if(map.containsKey(currentChar)) {
			start = Math.max(start, map.get(currentChar)+1);
		}
		
		map.put(currentChar, end);
		maxLength = Math.max(maxLength ,  end - start + 1);
		
	}
	return maxLength;
	
}
	public static void main(String[] args) {
		
		String input = "Mahesh";
		int longestLength = lengthOfLongestSubString(input);
		System.out.println("Longest substring without repeating characters: " + longestLength);
	}
}
