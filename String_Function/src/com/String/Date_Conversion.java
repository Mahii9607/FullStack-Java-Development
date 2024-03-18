package com.String;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class Date_Conversion {
	    public static void main(String[] args) {
	        // String representing the date
	        String dateString = "2024-03-11";

	        // Define the date format
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	        try {
	            // Parse the string into a Date object
	            Date date = dateFormat.parse(dateString);

	            // Print the parsed Date object
	            System.out.println("Parsed Date: " + date);
	        } catch (ParseException e) {
	            System.out.println("Error parsing the date: " + e.getMessage());
	        }
	    }
	}



