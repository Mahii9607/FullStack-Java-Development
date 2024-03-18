package com.String;

public class Remove_WhiteSpaces {

		public static void main(String[] args)
		{
			String str = "	 The	 Kiran Academy	 ";

			// Call the replaceAll() method
			str = str.replaceAll("\\s", "");

			System.out.println(str);
		}
	}


