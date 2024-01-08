package consoleapp.option;

import java.util.Set;


public interface Option<T> {
    String getName();
    String getDescription();
    Set<String> getAliases();
    T getValue();
}
