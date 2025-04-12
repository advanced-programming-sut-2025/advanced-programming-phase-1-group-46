package models.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum MainMenuCommands implements Command {
    ENTER_MENU(""),
    EXIT_MENU(""),
    SHOW_CURRENT_MENU(""),
    LOGOUT("");

    private final String regexPattern;

    MainMenuCommands(String regexPattern) {
        this.regexPattern = regexPattern;
    }

    @Override
    public Matcher getMatcher(String command) {
        Matcher matcher = Pattern.compile(regexPattern).matcher(command);
        return matcher.matches() ? matcher : null;
    }

    public String getRegexPattern() {
        return regexPattern;
    }
}
