package javaweek2;

import java.util.Scanner;

/* Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.*/
public class Programme19_ConvertStringToLowercase {
    public void convertStringToLowercase(String string){
        String s1 =string.toLowerCase();
        System.out.println("Lowercase string is: " + s1);

    }

    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string in uppercase");
        String uppercase = scanner.nextLine();
        Programme19_ConvertStringToLowercase obj = new Programme19_ConvertStringToLowercase();
        obj.convertStringToLowercase(uppercase);
        //closing the scanner
        scanner.close();
    }
}
