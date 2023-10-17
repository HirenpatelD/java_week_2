package javaweek2;

import java.util.Scanner;

/*Write a program to convert the upper case to lower case.*/
public class Programme9_ConvertUpperCaseToLowerCase {
    public void convertUpperCaseToLowercase(String uppercase){
        String lowercase = uppercase.toLowerCase();
        System.out.println("Lowercase output is: "+ lowercase );
    }
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase name");
        String uppercase = scanner.nextLine();
        Programme9_ConvertUpperCaseToLowerCase obj = new Programme9_ConvertUpperCaseToLowerCase();
        obj.convertUpperCaseToLowercase(uppercase);
        //Closing the scanner
        scanner.close();



    }
}


