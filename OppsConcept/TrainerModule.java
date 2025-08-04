package OppsConcept;

import java.util.Scanner;

public class TrainerModule {
    int trainerId;
    String trainerName;
    int totalSections;
    int perSection = 1500;
    int totalslary;
    Scanner sc =new Scanner(System.in);
    public void greetTrainer(){
        System.out.println("Enter Trainer ID:");
        trainerId = sc.nextInt();
        System.out.println("Enter Trainer Name:");
        trainerName = sc.next();

    }
    public int calculateSalary(){
        System.out.println("Enter Total Sections Handled:");
        totalSections = sc.nextInt();
        totalslary = totalSections*perSection;
        StudentModule studentReview = new StudentModule();
        byte review = studentReview.studentReview;
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
    public void TrainerReview(){
        System.out.println("Trainer ID:"+ trainerId);
        System.out.println("Trainer Name:"+ trainerName);
       
        System.out.println("Total salary"+ calculateSalary());
         System.out.println("Total Section Handled: "+ totalSections);
    }

}
