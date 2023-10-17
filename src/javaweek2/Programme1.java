package javaweek2;

public class Programme1 {

   // 1.1 Declare two instance variables.
    int a = 20;
    int b = 30;
    //1.2 Declare one instance method.
    //1.3 Call both instance variables into the instance method inside the print statement.
public void instanceMethod(){
    System.out.println(a);
    System.out.println(b);

}
//1.4 Declare the Main method.
// 1.5 Call the above instance method into the Main method an

    public static void main(String[] args) {
    Programme1 obj = new Programme1();
    obj.instanceMethod();


}

}
