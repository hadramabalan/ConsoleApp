package consoleapp.option;

import consoleapp.aliaschecker.AliasChecker;

import java.util.Set;

public class IntegerOption implements Option<Integer>{
    private String name;
    private String description;
    private Set<String> aliases;

    private Integer minValue = null;
    private Integer maxValue = null;
    private int value;

    public IntegerOption(String name, String description, Set<String> aliases) {
        this.name = name;
        this.description = description;
        this.aliases = aliases;
        validateAliases(new AliasChecker());
    }

    public IntegerOption(String name, String description, Set<String> aliases, Integer minValue, Integer maxValue) {
        this.name = name;
        this.description = description;
        this.aliases = aliases;
        this.minValue = minValue;
        this.maxValue = maxValue;
        validateAliases(new AliasChecker());
    }

    public IntegerOption(String name, String description, Set<String> aliases, Integer minValue, Integer maxValue, int value) {
        this.name = name;
        this.description = description;
        this.aliases = aliases;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.value = value;
        validateAliases(new AliasChecker());
    }

    //constructors with combinations of value, min and max

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getAliases() {
        return aliases;
    }
    public Integer getValue() {
        return value;
    }
    public void setValue(int value){}
}
