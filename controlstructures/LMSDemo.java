package controlstructures;
import java.util.Scanner;
public class LMSDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter ID:");
        int id = input.nextInt();
        System.out.println("enter your Name:");
        String name = input.next();
        System.out.println("enter your attendance:");
        double attendance = input.nextDouble();
        int TotalMarks = 0;
        int TotalSubjects = 0;
        char continueInput = 'y';
        while (continueInput == 'y' || continueInput == 'Y'){
            System.out.println("enter score For Subject :"+ (TotalSubjects+1));
            int currentScore = input.nextInt();
            TotalMarks  += currentScore;
            TotalSubjects++;
            System.out.println("Do you want to enter score for another subject? (y/n)");
            continueInput= input.next().charAt(0);

        }
        double averageMarks =(double) TotalMarks/TotalSubjects;

        String performance;
        if (averageMarks >= 85){
            performance = "Excellent";    
        }else if(averageMarks >=70){
            performance = "Good";

        }else if(averageMarks >=50){
            performance="Average";

        }else{
            performance = "Needs Improvement";
        }
        
        String attendanceStatus = attendance >=75 ? "OK - ATTENDANCE SATISFIED" : "WARNING - LOW ATTENDANCE ";

        System.out.println("ID:"+ id);
        System.out.println("Name:"+name);
        System.out.println("Total Marks:"+ TotalMarks);
        System.out.println("Total Subjects:"+TotalSubjects);
        System.out.println("Average Marks:"+ averageMarks);
        System.out.println("Performance:"+ performance);
        System.out.println("Attendance:"+ attendance);
        System.out.println("attendance status:"+ attendanceStatus);
        input.close();
    }
    
}
