package javaweek2;

import java.util.Scanner;

/*Write a program to calculate the area of a triangle.*/
public class Programme8_AreaOfTriangle {
    public void AreaOfTriangle(double length, double height) {
        double area = (length * height) / 2;
        System.out.println("AreaOfTriangle:" + area);
    }

    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of triangle");
       double length = scanner.nextDouble();
        System.out.println("enter the height of triangle");
        double height = scanner.nextDouble();
        Programme8_AreaOfTriangle obj = new Programme8_AreaOfTriangle();
        obj.AreaOfTriangle(length,height);
        //closing the scanner
        scanner.close();

    }

}
