package javaweek2;

import java.util.Scanner;

/*6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).*/
public class Programme6_AreaOfCircle {
    public static void areaOfCircle(double radius){
        double area = (Math.PI*radius*radius);
        System.out.println("Area of circle:" + area );
    }
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of radius");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
        //closing the scanner
        scanner.close();


    }

}
