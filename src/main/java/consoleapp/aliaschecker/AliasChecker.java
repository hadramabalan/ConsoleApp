package consoleapp.aliaschecker;

import java.util.Set;

public class AliasChecker {
    public void validateAliases(Set<String> aliases) {
        for (String alias : aliases) {
            if (!isValidAliasFormat(alias)) {
                throw new IllegalArgumentException("Invalid alias format: " + alias);
            }
        }
    }
    private boolean isValidAliasFormat(String alias) {
        // Check if the alias follows the desired format
        return alias.matches("^(-[a-zA-Z0-9])$|^(-{2}[a-zA-Z0-9]+)$");
    }
}
