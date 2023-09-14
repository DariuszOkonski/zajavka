package SOLID.section_04_OpenClosedPrinciple.ex1;

public class App {
    public static void main(String[] args) {
        InterviewQuestionProcessor.process(new FinanceInterviewQuestion());
        InterviewQuestionProcessor.process(new AIInterviewQuestion());
        InterviewQuestionProcessor.process(new AlgorithmsInterviewQuestion());
    }
}

