package Inheritance;

public class Lms {
    public static void main(String[] args) {
        System.out.println("Welcome to the learning management system");
        System.out.println("please enter your details");
        Student s1 = new Student();
        s1.displayInfo();
        s1.feesStatus();
        Trainer t1 = new Trainer();
        t1.displayInfo();
        t1.TrainerReview(s1.studentReview);

    }

}
