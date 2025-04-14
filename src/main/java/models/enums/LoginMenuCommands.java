package models.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum LoginMenuCommands implements Command {
    ENTER_MENU(""),
    EXIT_MENU(""),
    SHOW_CURRENT_MENU(""),
    LOGIN(""),
    FORGOT_PASSWORD("");

    private final String regexPattern;

    LoginMenuCommands(String regexPattern) {
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
