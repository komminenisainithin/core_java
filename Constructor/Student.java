package Constructor;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    int age;
    long mobileNumber;
    char grade;
    double feesPaid;
    double discountfee;
    double totalFees = 100000.00;
     Scanner input= new Scanner(System.in);

    public Student(){
        System.out.println("Enter Your Id :");
        this.id = input.nextInt();
        System.out.println("Enter Your Name");
        this.name = input.next();
        System.out.println("Enter Your Mobile Number:");
        this.mobileNumber = input.nextLong();
        System.out.println("Enter Your Age:");
        this.age = input.nextInt();
        System.out.println("Enter Your Grade('A','B','C','D'):");
        this.grade = Character.toUpperCase(input.next().charAt(0));
        System.out.println("Enter the fees amount you have Paid");
        this.feesPaid=input.nextDouble();
        this.discountfee = discount(this.grade);

        



    }
    public double discount(char grade){
        double discountAmount;
        switch (grade) {
            case 'A':
                discountAmount = (0.1)*totalFees;
                
                return discountAmount;
        
            case 'B':
                discountAmount = (0.2)*totalFees;
                
                return discountAmount;
            case 'C':
                discountAmount = (0.2)*totalFees;
                
                return discountAmount;
            case 'D':
                discountAmount = (0.2)*totalFees;
                
                return discountAmount;
                
            default:
                return totalFees;
        }
        
    }
    public void display(){
        System.out.println("Id:"+id);
        System.out.println("Name :"+ name);
        System.out.println("Mobile Number :"+ mobileNumber);
        System.out.println("Age :"+ age);
        System.out.println("Grade"+"'"+grade+"'");
    }
    public void feesStatus(){
        if (this.discountfee == this.feesPaid){
            System.out.println("Fees status : Paid Full Amount");
        }else{
            System.out.println("Fees status : Pending Amount to pay "+ (this.discountfee - this.feesPaid ));
        }
    }



}
