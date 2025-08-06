package Arrays;

import java.util.Scanner;

public class StudentMarks {
    String[] subjects = {"Telugu","Hindi","English","Maths","General Science"};
    int[] marks = new int[5];
    int TotalMarks=0;
    int max;
    int min;
    double avg;


    public StudentMarks(){
        Scanner input = new Scanner(System.in);
        for(int i = 0;i<marks.length;i++){
            System.out.println("Enter Your Marks in "+ subjects[i]);
            marks[i]=input.nextInt();
            TotalMarks+=marks[i];
        } 
        this.max = marks[0];
        this.min = marks[0];
        this.avg = (double)TotalMarks/marks.length;
        maxAndMin();

    }
    public static void main(String[] args){
        StudentMarks stu1 = new StudentMarks();
        System.out.println("Student Info");
        System.out.println("Student Total Marks:"+stu1.TotalMarks);
        System.out.println("Student Averge Marks :"+ stu1.avg);
        stu1.display(stu1.max);
        stu1.display(stu1.min);


    }
    
        
    public void maxAndMin(){
        for(int i = 1; i<marks.length;i++){
            if(max<marks[i]){
                this.max=marks[i];
            }
            if (min>marks[i]) {
                this.min = marks[i];
            }
        }
    }
    public void display(int x){
        int index =0;
        for(int i = 0;i<marks.length;i++){
            if(x==marks[i]){
                index=i;
                break;
                
            }
        }
        if (x==max) {
            System.out.println("maximum marks in "+subjects[index] +" = " +marks[index]);
            
        }else{
            System.out.println("minimum marks in "+subjects[index] +" = " +marks[index]);
        }
    }

}
