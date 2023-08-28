package SOLID.section_04_OpenClosedPrinciple.ex1;

public class InterviewQuestionProcessor {
    public static void process(InterviewQuestion question) {
        // this is a typical implementation of the loosely coupled system
        // this class knows nothing about the question and its type
        question.execute();
    }
}
