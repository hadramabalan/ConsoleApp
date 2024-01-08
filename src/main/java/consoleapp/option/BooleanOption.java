package consoleapp.option;

import consoleapp.aliaschecker.AliasChecker;

import java.util.Set;

public class BooleanOption implements Option<Boolean>{
    private String name;
    private String description;
    private Set<String> aliases;
    private Set<String> trueValues;
    private Set<String> falseValues;
    private boolean value = true;

    public BooleanOption(String name, String description, Set<String> aliases) {
        this.name = name;
        this.description = description;
        this.aliases = aliases;
        validateAliases(new AliasChecker());
    }

    public BooleanOption(String name, String description, Set<String> aliases, Set<String> trueValues, Set<String> falseValues) {
        this.name = name;
        this.description = description;
        this.aliases = aliases;
        this.trueValues = trueValues;
        this.falseValues = falseValues;
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

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
    }
    public Set<String> getTrueValues() {
        return trueValues;
    }
    public Set<String> getFalseValues() {
        return falseValues;
    }

}
