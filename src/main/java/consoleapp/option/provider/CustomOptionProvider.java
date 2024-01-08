package consoleapp.option.provider;

import consoleapp.option.Option;

import java.util.Set;

public interface CustomOptionProvider<T> {
    Option<T> createCustomOption(String name, String description, Set<String> aliases);

    // additional methods for customization as needed, custom constraints etc.
}
