package javaweek2;

import java.util.Scanner;
/*Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.*/
public class Programme13 {
    public void averageOfThreeNumbers(double num1,double num2,double num3){
        double average = (num1 + num2 + num3)/ 3;

        System.out.println("The average of the three number is: " + average);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number");
        double num3 = scanner.nextDouble();
        Programme13 obj = new Programme13();
        obj.averageOfThreeNumbers(num1,num2,num3);
        //close the scanner
        scanner.close();
    }

}
