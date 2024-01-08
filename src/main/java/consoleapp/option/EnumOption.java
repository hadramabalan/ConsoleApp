package consoleapp.option;

import consoleapp.aliaschecker.AliasChecker;

import java.util.Set;

public class EnumOption<T> implements Option<T>{
    private String name;
    private String description;
    private Set<String> aliases;
    private Set<T> enumValues;
    private T value;

    public EnumOption(String name, String description, Set<String> aliases, Set<T> enumValues) {
        this.name = name;
        this.description = description;
        this.aliases = aliases;
        this.enumValues = enumValues;
        validateAliases(new AliasChecker());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Set<String> getAliases() {
        return aliases;
    }

    public T getValue() {
        return value;
    }
    public Set<T> getEnumValues() {return enumValues;}
    public void setValue(String value) {
    }
}
