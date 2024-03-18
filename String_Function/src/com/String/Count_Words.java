package com.String;

public class Count_Words {

		static final int OUT = 0;
		static final int IN = 1;
		
		
		static int countWords(String str)
		{
			int state = OUT;
			int wc = 0; // word count
			int i = 0;
			
			
			while (i < str.length())
			{
				
				if (str.charAt(i) == ' ' || str.charAt(i) == '\n'
						|| str.charAt(i) == '\t')
					state = OUT;
					
		
				
				else if (state == OUT)
				{
					state = IN;
					++wc;
				}
		
				
				++i;
			}
			return wc;
		}
		
		
		public static void main(String args[])
		{
			String str = "Mahesh \n Rupesh \n Abhishek ";
			System.out.println("No of words : " + countWords(str));
		}
	}
	



