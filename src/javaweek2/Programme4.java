package javaweek2;

public class Programme4 {
    //4.1 Declare two instance and two static variables.

   String name = "Methew";// instance variable
    int b = 20;// instance variable
    static int number = 30;// static variable
    static String surname = "Hayden";
    //4.2 Declare one instance method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the
    // print statement;
    public void instanceMethod(){
     Programme4 obj = new Programme4();
     System.out.println(name);
     System.out.println(b);
     System.out.println(Programme4.surname);
     System.out.println(Programme4.number);

    }
    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the
    // print statement;
    public static void staticMethod(){
     Programme4 obj = new Programme4();
     System.out.println(number);
     System.out.println(surname);
     System.out.println(obj.name);
     System.out.println(obj.b);
    }
    //4.5 Declare the Main method.
 //4.6 Call both instance and static methods into the Main method and run the programme.
     public static void main(String[] args) {
     Programme4 obj = new Programme4();
     staticMethod();
     obj.instanceMethod();
    }
}
