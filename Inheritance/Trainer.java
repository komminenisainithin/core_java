package Inheritance;

import java.util.Scanner;


public class Trainer extends Person {
    int totalSections;
    int perSection = 1500;
    int totalslary;
    Scanner sc =new Scanner(System.in);
    public Trainer(){
        super();
    }
    
    public int calculateSalary(int review){
        
        System.out.println("Enter Total Sections Handled:");
        totalSections = sc.nextInt();
        totalslary = totalSections*perSection;
        
        
        switch (review) {
            case 5:
                totalslary += 5000;
                
                break;
            case 4:
                totalslary += 4000;
                break;
            case 3:
                totalslary += 3000;
                break;
            case 2:
                totalslary += 2000;
                break;
            case 1:
                totalslary += 1000;
                break;
            

            default:
                totalslary +=0;
                break;
        }
        return totalslary;

    }
    public void TrainerReview( int review){
        super.displayInfo();
        int Review = review;
       
        System.out.println("Total salary"+ calculateSalary(Review));
         System.out.println("Total Section Handled: "+ totalSections);
    }

}
