package zajavkaProject.service;

public class MortgageException extends RuntimeException{
    public MortgageException() {
        super("Case not handled");
    }
}
