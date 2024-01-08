package consoleapp.Exception;

public class MissingArgumentException extends RuntimeException {
    public MissingArgumentException(String optionName) {
        super("Missing argument for option: " + optionName);
    }
}
