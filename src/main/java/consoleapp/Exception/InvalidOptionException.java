package consoleapp.Exception;

public class InvalidOptionException extends RuntimeException {
    public InvalidOptionException(String optionName) {
        super("Invalid option: " + optionName);
    }
}
