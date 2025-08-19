package Inheritance;

import java.util.Scanner;

public class Student extends Person {
    

    char grade;
    double feesPaid;
    double discountfee;
    double totalFees = 100000.00;
    int studentReview;
    Scanner input= new Scanner(System.in);
   
    public Student(){
        
        super();
        System.out.println("Enter Your Grade('A','B','C','D'):");
        this.grade = Character.toUpperCase(input.next().charAt(0));
        System.out.println("Enter the fees amount you have Paid");
        this.feesPaid=input.nextDouble();
        System.out.println("enter your review for the trainer (1-5) :");
        this.studentReview = input.nextInt();
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
    
    public void feesStatus(){
        if (this.discountfee == this.feesPaid){
            System.out.println("Fees status : Paid Full Amount");
        }else{
            System.out.println("Fees status : Pending Amount to pay "+ (this.discountfee - this.feesPaid ));
        }
    }



}
