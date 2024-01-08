package consoleapp.option;

import consoleapp.aliaschecker.AliasChecker;

import java.util.Set;

public class StringOption implements Option<String>{
    private String name;
    private String description;
    private Set<String> aliases;
    private Integer minLength = null;
    private Integer maxLength = null;
    private String value;

    public StringOption(String name, String description, Set<String> aliases) {
        this.name = name;
        this.description = description;
        this.aliases = aliases;
        validateAliases(new AliasChecker());
    }

    public StringOption(String name, String description, Set<String> aliases, Integer minLength, Integer maxLength) {
        this.name = name;
        this.description = description;
        this.aliases = aliases;
        this.minLength = minLength;
        this.maxLength = maxLength;
        validateAliases(new AliasChecker());
    }

    //constuctors with combinations of min, max and value

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

    public String getValue() {
        return value;
    }

    public void setValue(String value){}
}
