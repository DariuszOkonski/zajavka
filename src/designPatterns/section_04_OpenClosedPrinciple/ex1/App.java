package designPatterns.section_04_OpenClosedPrinciple.ex1;

public class App {
    public static void main(String[] args) {
        InterviewQuestionProcessor.process(new AIInterviewQuestions());
        InterviewQuestionProcessor.process(new FinanceInterviewQuestions());
        InterviewQuestionProcessor.process(new AlgorithmsInterviewQuestions());
        InterviewQuestionProcessor.process(new CSInterviewQuestions());
    }
}

