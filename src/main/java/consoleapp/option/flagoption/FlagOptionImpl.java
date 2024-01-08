package consoleapp.option.flagoption;

import java.util.Set;

public class FlagOptionImpl implements FlagOption{
    private String name;
    private String description;
    private Set<String> aliases;

    public FlagOptionImpl(String name, String description, Set<String> aliases) {
        this.name = name;
        this.description = description;
        this.aliases = aliases;
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

    @Override
    public Boolean getValue() {
        return true;
    }
}
