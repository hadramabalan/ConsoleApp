package consoleapp.Exception;

public class InvalidValueException extends RuntimeException {
    public InvalidValueException(String optionName, String value) {
        super("Invalid value for option " + optionName + ": " + value);
    }
}
