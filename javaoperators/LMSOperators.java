package javaoperators;

public class LMSOperators {
    public static void main(String[] args) {
        int id=101;
        String studentName = "SAI NITHIN";
        Byte age = 21;
        byte quizScore= 75;
        byte assignmentScore = 70;
        byte examScore =80;
        double attendancePercentage= 80.00;

        //calculation -- arithmetic operators
        double totalScore = quizScore+ assignmentScore + examScore;
        double averageScore = totalScore/3;

        // determine pass or fail -- ternary operator and relational operator
        String result = (averageScore >= 75)? "Pass": "Fail";
        boolean isStudentPassed = averageScore >= 75;


        //update attendance --increment operator
        attendancePercentage++;


        //evaluate student qualified or not --> logical operator
        // required attendance is 80% and need to pass
        boolean isQualified = (isStudentPassed && attendancePercentage >= 80);

        //display student details
        System.out.println("Student ID:"+ id);
        System.out.println("Student Age:"+ age);
        System.out.println("Student Name:"+ studentName);
        System.out.println("Total Score:"+ totalScore);
        System.out.println("Average Score:"+ averageScore);
        System.out.println("results:"+ result);
        System.out.println("Updated Attendance Percentage:"+ attendancePercentage +"%");
        System.out.println("Is Student Qualified? :"+ isQualified);








    }

}
