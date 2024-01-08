package consoleapp.processor;

import consoleapp.option.Option;
import consoleapp.option.provider.CustomOptionProvider;

import java.util.HashMap;
import java.util.Map;

public class DefaultOptionProcessor implements OptionProcessor {
    private final Map<String, Option<?>> options = new HashMap<>();
    private final Map<String, CustomOptionProvider<?>> customOptionProviders = new HashMap<>();

    @Override
    public <T> void addOption(String name, Option<T> option) {
        options.put(name, option);
    }

    @Override
    public void processOptions(String[] args) {
        // parse command line and update option values
    }

    @Override
    public <T> T getOptionValue(String option) {
        // Implementation to retrieve the value of the specified option
        @SuppressWarnings("unchecked")
        Option<T> typedOption = (Option<T>) options.get(option);
        return typedOption != null ? typedOption.getValue() : null;
    }

    @Override
    public boolean hasOption(String option) {
        return false;
    }

    @Override
    public <T> void registerCustomOptionProvider(CustomOptionProvider<T> customOptionProvider) {
        // Register a custom option provider for handling custom options
        customOptionProviders.put(customOptionProvider.getClass().getName(), customOptionProvider);
    }

    private void handleException(Exception e, String optionName) {
        //implementation
        //is default behavior of handling exceptions ok or should it be customizable?
    }
}