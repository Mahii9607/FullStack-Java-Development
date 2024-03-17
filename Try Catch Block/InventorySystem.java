package com.Try_Catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InventorySystem {


public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Welcome to the Inventory System");
	 
	 try {
		 File inventoryFile = new File("inventory.txt");
		 Scanner fileScanner = new Scanner(inventoryFile);
		 while(fileScanner.hasNextLine()) {
			 String line = fileScanner.nextLine();
			 System.out.println(line);
		 }
		 fileScanner.close();
		 
		 
		 System.out.println("Enter the item to add to the inventory: ");
		 String newItem = sc.nextLine();
		 
		 System.out.println("Inventory updated successfully!");
	 }catch(FileNotFoundException e){
		 System.out.println("Error: Inventory file not found");
	 }catch(IOException e) {
          
		 System.out.println("Error: Unable to read/write inventory file.");
	 }finally {
			 sc.close();
		 }
		
		 
	 }
	 
}



