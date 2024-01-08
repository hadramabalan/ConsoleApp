package consoleapp.option;

import java.util.Set;

public class BooleanOption implements Option<Boolean>{
    private String name;
    private String description;
    private Set<String> aliases;

    private Set<String> trueValues;
    private Set<String> falseValues;
    private boolean value;

    public BooleanOption(String name, String description, Set<String> trueValues, Set<String> falseValues) {
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
}
