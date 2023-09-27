package zajavka2.warsztat_01.ex38.Project;


import java.util.ArrayDeque;
import java.util.List;

public class App {
    public static void main(String[] args) {
        CustomQueue<Person> queue = new CustomQueue<>(new ArrayDeque<>(), new ArrayDeque<>());
        PersonCommandProcessor commandProcessor = new PersonCommandProcessor(queue);

        List<String> commandList = List.of(
                "ADD_PERSON(Tomasz_Romański)",
                "ADD_PERSON(Tomasz_Romański)",
                "ADD_PERSON(Tomasz_Romański)",
                "ADD_PERSON(Tomasz_Romański, VIP)",
                "ADD_PERSON(Rafał_Adamczuk)",
                "ADD_PERSON(Tomasz_Romański)",
                "ADD_PERSON(Mariusz_Wilczek)",
                "ADD_PERSON(Zbigniew_Ratownik), VIP",
                "PROCESS",
                "LEAVE_PERSON(Tomasz_Romański_2)",
                "LEAVE_PERSON(Mariusz_Wilczek)",
                "LEAVE_PERSON(Mariusz_Wilk)",
                "PROCESS",
                "PROCESS",
                "PROCESS",
                "PROCESS",
                "PROCESS",
                "PROCESS",
                "PROCESS",
                "PROCESS"
        );

        for (String command : commandList) {
            commandProcessor.processCommand(command);
        }
    }
}