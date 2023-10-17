package javaweek2;

import java.util.Scanner;

/*Write a Java program to convert a decimal number to binary number.

Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101*/
public class Programme17_ConvertDecimalToBinary {
    public static void convertDecimalToBinary(int x){
        String binary = Integer.toBinaryString(x); //converting integer value to binary number
        System.out.println("Binary value is: " + binary);

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//creating the object for scanner
        System.out.println("Enter a decimal number: ");//Printing the decimal number for user
        int x = scanner.nextInt();
       convertDecimalToBinary(x);
       //closing the scanner
        scanner.close();
    }
}
