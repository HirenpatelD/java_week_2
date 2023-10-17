package javaweek2;
/*
* Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)*/

import java.util.Scanner;

public class Programme5_Calculator {
    public static void addition(int a,int b){
        int ans = a + b;
        //Concatenation
        System.out.println("Addition of two numbers "+ a + " and "+ b + " is :"+ ans);

    }
    public static void substraction(int a,int b){
        int ans = a - b;
        //Concatenation
        System.out.println("substraction of two numbers "+ a + " and "+ b + " is :"+ ans);
    }
public void multiplication(int a, int b){
        int ans = a * b;
    //Concatenation
    System.out.println("multiplication of two numbers "+ a + " and "+ b + " is :"+ ans);

}
public void divison(int a, int b){
        int ans = a / b;
    //Concatenation
    System.out.println("Divison of two numbers "+ a + " and "+ b + " is :"+ ans);


}

    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Please enter second number");
        int b = scanner.nextInt();
        Programme5_Calculator obj = new Programme5_Calculator();
        addition(a,b);
        substraction(a,b);
        obj.multiplication(a,b);
        obj.divison(a,b);
        //closing scanner
        scanner.close();

    }







}

