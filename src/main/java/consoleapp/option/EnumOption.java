package consoleapp.option;

import java.util.Set;

public class EnumOption implements Option<String>{
    private String name;
    private String description;
    private Set<String> aliases;
    private Set<String> enumValues;
    private String value;

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
}
