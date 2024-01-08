package consoleapp.processor;

import consoleapp.option.Option;
import consoleapp.option.provider.CustomOptionProvider;

public interface OptionProcessor {
    <T> void addOption(String name, Option<T> option);

    void processOptions(String[] args);
    <T> T getOptionValue(String option);
    boolean hasOption(String option);
    <T> void registerCustomOptionProvider(CustomOptionProvider<T> customOptionProvider);

}
