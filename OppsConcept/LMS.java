package OppsConcept;

public class LMS {
    public static void main(String[] args) {
        StudentModule student = new StudentModule();
        TrainerModule trainer = new TrainerModule();
        student.greetStudent();
        student.FinalAhievement();
        student.StudentReview();
        trainer.greetTrainer();
        trainer.TrainerReview();
    }

}
