package com.String;
import java.io.*;


public class Palindrome {


		public static boolean isPalindrome(String str)
		{
			
			String rev = "";

			
			boolean ans = false;

			for (int i = str.length() - 1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}

			// Checking if both the strings are equal
			if (str.equals(rev)) {
				ans = true;
			}
			return ans;
		}
		public static void main(String[] args)
		{
			// Input string
			String str = "Mahii";

			// Convert the string to lowercase
			str = str.toLowerCase();
			boolean A = isPalindrome(str);
			System.out.println(A);
		}
}
	



