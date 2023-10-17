package javaweek2;

import java.util.Scanner;

/*Write a Java program to swap two variables.*/
public class Programme15_SwapVariable {
    public static void swapVariable(int a, int b){
        int c;
        System.out.println("Before swapping, The value of first variable is: " + a + "The value of second variable is:" + b );
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping, The value of first variable is: " + a + "The value of second variable is: " + b );

    }
    public static void main(String[] args) {
   //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value");
        int firstVariable = scanner.nextInt();
        System.out.println("Enter the second variable value");
        int secondVariable = scanner.nextInt();
        swapVariable(firstVariable,secondVariable);
        // Closing the scanner
        scanner.close();
    }
}
