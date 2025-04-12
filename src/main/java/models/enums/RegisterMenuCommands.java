package models.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum RegisterMenuCommands implements Command {
    ENTER_MENU(""),
    EXIT_MENU(""),
    SHOW_CURRENT_MENU(""),
    REGISTER("");
    private final String regexPattern;

    RegisterMenuCommands(String regexPattern) {this.regexPattern = regexPattern;}

    @Override
    public Matcher getMatcher(String command) {
        Matcher matcher = Pattern.compile(regexPattern).matcher(command);
        if (matcher.matches()) return matcher;
        return null;
    }
}
