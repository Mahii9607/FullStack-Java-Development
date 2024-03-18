package com.String;

public class Number_Conversion {

	public static void main(String[] args) {
        int decimalNumber = 1234;

        String binary = convertToBinary(decimalNumber);
        String octal = convertToOctal(decimalNumber);
        String hexadecimal = convertToHexadecimal(decimalNumber);

        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
    }

    public static String convertToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    public static String convertToOctal(int decimalNumber) {
        return Integer.toOctalString(decimalNumber);
    }

    public static String convertToHexadecimal(int decimalNumber) {
        return Integer.toHexString(decimalNumber);
    }
	
}
