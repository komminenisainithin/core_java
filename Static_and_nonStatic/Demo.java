package Static_and_nonStatic;

import java.util.Random;

public class Demo {
    int num1;
    static int num2;
    public void addition(){
        int a = 5;
        int b = 10;
        System.out.println("sum of two numbers"+(a+b));
    }
   public static void main(String[] args) {
    Demo d1 = new Demo();
    d1.num1 = new Random().nextInt();
    num2 = new Random().nextInt();
    System.err.println(d1.num1);
    System.out.println(num2);

    Demo d2 = new Demo();
    d2.num1 = new Random().nextInt();
    num2 = new Random().nextInt();
    System.err.println(d2.num1);
    System.out.println(num2);

    

    Demo d3 = new Demo();
    d3.num1 = new Random().nextInt();
    num2 = new Random().nextInt();
    System.err.println(d3.num1);
    System.out.println(num2);

   }
}
