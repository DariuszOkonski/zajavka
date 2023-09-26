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
        System.out.println(command);
        Person incomingPerson = createIncomingPerson(command);
        customQueue.welcome(incomingPerson);

    }

    private Person createIncomingPerson(String command) {
        String personKey = command
                .replace("ADD_PERSON(", "")
                .replace(")", "");

        String[] split = personKey
                .split("_");

        if(split.length == 2) {
            return new Person(split[0], split[1], customQueue.getAndIncrementCounter(personKey));
        } else {
            throw new IllegalArgumentException("Illegal argument: " + command);
        }
    }

    private void handleLeavePerson(String command) {
        //        "LEAVE_PERSON(Tomasz_Romański_2)",
        System.out.println(command);
        Person person = createLeavingPerson(command);
        customQueue.leave(person);
    }

    private static Person createLeavingPerson(String command) {
        String personId = command
                .replace("LEAVE_PERSON(", "")
                .replace(")", "");

        String[] splitId = personId.split("_");

        if(splitId.length == 2) {
            return new Person(splitId[0], splitId[1], 1);
        }else if(splitId.length == 3) {
            return new Person(splitId[0], splitId[1], Integer.parseInt(splitId[2]));
        }
        throw new IllegalArgumentException("Illegal argument: " + command);
    }

    private void handleProcess(String command) {
        System.out.println(command);
        customQueue.enter();
    }
}
