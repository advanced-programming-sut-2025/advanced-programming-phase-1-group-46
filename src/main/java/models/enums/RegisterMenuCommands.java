package models.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum RegisterMenuCommands implements Command {
    EnterMenu(""),
    ExitMenu(""),
    ShowCurrentMenu(""),
    Register("");
    private final String regexPattern;

    RegisterMenuCommands(String regexPattern) {this.regexPattern = regexPattern;}

    @Override
    public Matcher getMatcher(String command) {
        Matcher matcher = Pattern.compile(regexPattern).matcher(command);
        if (matcher.matches()) return matcher;
        return null;
    }
}
