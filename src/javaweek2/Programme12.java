package javaweek2;
/* Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
*/
public class Programme12 {
    public static void printExpressions(){
        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println("Expected Output: " + result);
    }
    public static void main(String[] args) {
     printExpressions();
    }


}
