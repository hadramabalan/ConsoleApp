package consoleapp.option;

import consoleapp.aliaschecker.AliasChecker;

import java.util.Set;


public interface Option<T> {
    String getName();
    String getDescription();
    Set<String> getAliases();
    T getValue();
    default void validateAliases(AliasChecker aliasChecker) {
        aliasChecker.validateAliases(getAliases());
    }
}
