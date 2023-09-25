package zajavka2.warsztat_01.ex37.zad3;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Deque;

public class InvoiceStack {
    private Integer counter = 1;
    private Deque<Invoice> invoiceStack = new ArrayDeque<>();

    public void processInput(String command) {
        if (command.contains("CEO: ADD INVOICE")) {
            processCEOInput(command);
        } else if ("ACCOUNTANT: PROCESS INVOICE".contains(command)) {
            processAccountantInput(command);
        } else {
            System.out.println("O co Ci chodzi?");
        }
    }

    private void processCEOInput(String command) {
        BigDecimal amount = new BigDecimal(command.substring(command.indexOf("(") + 1, command.indexOf(")")));
        Integer year = 2005;
        String id = counter + "/" + year;
        counter++;

        Invoice invoice = new Invoice(id, amount);
        this.invoiceStack.push(invoice);

        System.out.printf(
                        "%s\n" +
                        "CEO added invoice: ID: %s, amount: %s\n" +
                        "Current invoices amount: %s. Invoices: %s", command, id, amount, getInvoiceSum(), invoiceStack
        );
        System.out.println();
    }

    private void processAccountantInput(String command) {
        System.out.printf("%n%s%n", command);

        if(invoiceStack.isEmpty()) {
            System.out.println("Stack empty. No work for Accountant");
            return;
        }

        Invoice invoice = this.invoiceStack.pop();

        System.out.printf("ACCOUNTANT processed invoice: %s%n", invoice);
        System.out.printf("Current invoices amount: %s. Invoices: %s%n", getInvoiceSum(), invoiceStack);
    }

    private String getInvoiceSum() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Invoice invoice : invoiceStack) {
            sum = sum.add(invoice.getAmount());
        }
        return sum.toString();
    }
}
