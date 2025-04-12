package models.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ProfileMenuCommands implements Command {
    EnterMenu(""),
    ExitMenu(""),
    ShowCurrentMenu(""),
    ChangeUsername(""),
    ChangeNickname(""),
    ChangePassword(""),
    ChangeEmail(""),
    ShowUserInfo("");
    private final String regexPattern;

    ProfileMenuCommands(String regexPattern) {this.regexPattern = regexPattern;}

    @Override
    public Matcher getMatcher(String command) {
        Matcher matcher = Pattern.compile(regexPattern).matcher(command);
        if (matcher.matches()) return matcher;
        return null;
    }
}
