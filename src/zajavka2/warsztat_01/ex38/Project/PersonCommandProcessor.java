package zajavka2.warsztat_01.ex38.Project;

public class PersonCommandProcessor {
    private final CustomQueue<Person> customQueue;

    public PersonCommandProcessor(CustomQueue<Person> customQueue) {
        this.customQueue = customQueue;
    }

    public void processCommand(String command) {
        if(command.contains("ADD_PERSON")) {
            handleAddPerson(command);
        } else if(command.contains("LEAVE_PERSON")) {
            handleLeavePerson(command);
        } else if(command.contains("PROCESS")) {
            handleProcess(command);
        } else {
            throw new RuntimeException("O co Ci chodzi? z tą komendą: " + command);
        }
    }

    private void handleAddPerson(String command) {
        //        "ADD_PERSON(Tomasz_Romański)"
        String personKey = command
                .replace("ADD_PERSON(", "")
                .replace(")", "");

        String[] split = personKey
                .split("_");

        if(split.length == 2) {
            String name = split[0];
            String surname = split[1];
            Integer counter = customQueue.getAndIncrementCounter(personKey);

            customQueue.welcome(new Person(name, surname, counter));
        }


    }

    private void handleLeavePerson(String command) {
        //        "LEAVE_PERSON(Tomasz_Romański_2)",
    }

    private void handleProcess(String command) {
        //        "PROCESS",
    }
}
