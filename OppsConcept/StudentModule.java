package OppsConcept;

import java.util.Scanner;

public class StudentModule {
    int studentId;
    String studentNmae;
    int sessionsAttended;
    int TotalMarks;
    int TotalSubjects;
    byte totalCradits;
    double precentage;
    byte studentReview;
    char continueInput = 'y';
    Scanner sc = new Scanner(System.in);
    public void greetStudent(){
        System.out.println("Enter student ID");
        studentId= sc.nextInt();
        System.out.println("Enter Student Full Name");
        studentNmae = sc.next();
    }
    public byte SessionsAttended(){
        System.out.println("Enter number of sessions attended");
        sessionsAttended = sc.nextInt();
        if(sessionsAttended>=30){
            return 5;
        }else{
            return 0;
        }

    }
    public byte PerformanceCredits(){
        while (continueInput=='y') {
            System.out.println("Enter Score for Subject:"+(TotalSubjects+1));
            TotalMarks += sc.nextInt();
            TotalSubjects++;
            System.out.println("Do you want to enter score for another subject? (y/n)");
            continueInput=sc.next().charAt(0);            
        }
        int Marks = TotalSubjects*100;
        // double averageMarks = (double) TotalMarks/TotalSubjects;
        precentage=((double)TotalMarks/Marks)*100;
        if (precentage >= 85){
            return 5;
        }else if(precentage >=60){
            return 3;
        }else{
            return 0;
        }
    }
    public void FinalAhievement(){
        totalCradits = (byte) (SessionsAttended()+ PerformanceCredits());
        System.out.println("Student ID:"+ studentId);
        System.out.println("Student Name:"+ studentNmae);
        System.out.println("Total Marks:"+ TotalMarks);
        System.out.println("Total Subjects:"+ TotalSubjects);
        System.out.println("Percentage:"+ precentage);
        System.out.println("Total Cradits:"+ totalCradits);

        if (totalCradits >=10) {
            System.out.println("Student Achieved: GOLD Credit");
            
        }else if(totalCradits >= 8){
            System.out.println("Student Achieved : SILVER Credit");
        }else{
            System.out.println("You Need To IMPROVE");
        }

    }

    public void StudentReview(){
        System.out.println("Enter Student Rewiew (1-5)");
        studentReview = sc.nextByte();
       
        
    }
    


}
