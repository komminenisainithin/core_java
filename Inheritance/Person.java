package Inheritance;

import java.util.Scanner;

public class Person {
    int id;
    String name;
    int age;
    long mobileNumber;

    Scanner input = new Scanner(System.in);

    public Person(){
        System.out.println("Enter ID :");
        this.id=input.nextInt();

        input.nextLine();
        System.out.println("Enter Your Name :");
        this.name=input.nextLine();
        System.out.println("Enter your Age :");
        this.age=input.nextInt();
        System.out.println("Enter your Mobile Number");
        this.mobileNumber=input.nextLong();

    }
    public void displayInfo(){
        System.out.println("ID:"+ id);
        System.out.println("Name : "+ name);
        System.out.println("Age :"+ age);
        System.out.println("Mobile Number : "+ mobileNumber);
    }



}
