package consoleapp.option;

import java.util.Set;

public class IntegerOption implements Option<Integer>{
    private String name;
    private String description;
    private Set<String> aliases;

    private int minValue;
    private int maxValue;
    private int value;

    public IntegerOption(String name, String description, int minValue, int maxValue, Set<String> aliases) {
    }
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
}
