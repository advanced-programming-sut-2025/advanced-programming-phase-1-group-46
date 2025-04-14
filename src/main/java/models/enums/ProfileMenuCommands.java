package models.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ProfileMenuCommands implements Command {
    ENTER_MENU(""),
    EXIT_MENU(""),
    SHOW_CURRENT_MENU(""),
    CHANGE_USERNAME(""),
    CHANGE_NICKNAME(""),
    CHANGE_PASSWORD(""),
    CHANGE_EMAIL(""),
    SHOW_USER_INFO("");
    private final String regexPattern;

    ProfileMenuCommands(String regexPattern) {this.regexPattern = regexPattern;}

    @Override
    public Matcher getMatcher(String command) {
        Matcher matcher = Pattern.compile(regexPattern).matcher(command);
        if (matcher.matches()) return matcher;
        return null;
    }
}
