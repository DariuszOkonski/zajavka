package zajavka2.warsztat_01.ex37.zad3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        InvoiceStack invoiceStack = new InvoiceStack();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String command = scanner.nextLine();
            invoiceStack.processInput(command);
        }
    }
}

//        List<String> commandList = List.of(
//                "CEO: ADD INVOICE(19.20)",
//                "CEO: ADD INVOICE(31.40)",
//                "ACCOUNTANT: PROCESS INVOICE",
//                "CEO: ADD INVOICE(21.20)",
//                "CEO: ADD INVOICE(120.99)",
//                "ACCOUNTANT: PROCESS INVOICE",
//                "ACCOUNTANT: PROCESS INVOICE",
//                "ACCOUNTANT: PROCESS INVOICE",
//                "ACCOUNTANT: PROCESS INVOICE"
//        );