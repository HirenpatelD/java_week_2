package javaweek2;

public class Programme3 {
    //3.1 Declare one instance and one static variable.
    static int b = 40;
    String name = "Patel";
    //3.2 Declare one instance method.
    //3.4 Call both instance and static variables into both instance and static methods inside the
    //print statement.
    public void instanceMethod(){
        Programme3 obj = new Programme3();
        System.out.println(obj.b);
        System.out.println(name);
    }
    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static methods inside the
    //print statement.
    public static void staticMethod(){
        Programme3 obj1 = new Programme3();
        System.out.println(b);
        System.out.println(obj1.name);

    }
    //3.5 Declare the Main method.
    // 3.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Programme3 obj2 = new Programme3();
        staticMethod();
        obj2.instanceMethod();


    }



}
