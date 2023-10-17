package javaweek2;

import java.util.Scanner;

/*Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/
public class Programme7_TemperatureValue {
    public void TemperatureConversation(float temperature){
        float temp = ((temperature - 32) * 5/9);
        System.out.println("Temperature Value:" + temp);
    }

    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the temperature value");
        float temp = scanner.nextFloat();
        Programme7_TemperatureValue obj = new Programme7_TemperatureValue();
        obj.TemperatureConversation(temp);
        //closing the scanner
        scanner.close();
    }

}
