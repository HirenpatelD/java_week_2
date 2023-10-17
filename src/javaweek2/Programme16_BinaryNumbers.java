package javaweek2;

import java.util.Scanner;

/*Write a Java program to add two binary numbers.

Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:

Sum of two binary numbers: 101
*/
public class Programme16_BinaryNumbers {
    public void BinaryNumbers(String firstNum, String secondNum ){
        int a = Integer.parseInt(firstNum,2);
        int b = Integer.parseInt(secondNum,2);
        int total = a + b;
        String binary = Integer.toBinaryString(total);
        System.out.println("sum of two binary numbers: " + binary);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first binary number");
        String firstNum = scanner.nextLine();
        System.out.println("Enter the second binary number");
        String secondNum = scanner.nextLine();
        Programme16_BinaryNumbers obj = new Programme16_BinaryNumbers();
        obj.BinaryNumbers(firstNum,secondNum);
        //Closing the scanner
        scanner.close();



    }

}
