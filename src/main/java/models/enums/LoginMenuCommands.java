package models.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum LoginMenuCommands implements Command {
    EnterMenu(""),
    ExitMenu(""),
    ShowCurrentMenu(""),
    Login(""),
    ForgotPassword("");
    private final String regexPattern;

    LoginMenuCommands(String regexPattern) {this.regexPattern = regexPattern;}

    @Override
    public Matcher getMatcher(String command) {
        Matcher matcher = Pattern.compile(regexPattern).matcher(command);
        if (matcher.matches()) return matcher;
        return null;
    }
}
