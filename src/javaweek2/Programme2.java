package javaweek2;

public class Programme2 {
    //2.1 Declare two static variables
    static int x = 100;
    static String name = "Mr patel";
   //2.2 Declare one static method
    // 2.3 Call both static variables into the static method inside the print statement.
    public static void staticMethod(){
        System.out.println(x);
        System.out.println(name);
    }
    //2.4 Declare the Main method.
    //2.5 Call the static method into the Main method and Run the programme.
    public static void main(String[] args) {
        staticMethod();

    }


}
