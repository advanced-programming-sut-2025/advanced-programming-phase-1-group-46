package views;

import models.Result;

import java.util.Scanner;
import java.util.regex.Matcher;

public class RegisterMenu implements AppMenu {
    @Override
    public Result check(Scanner scanner) {
        String command = scanner.nextLine().trim();
        Matcher matcher;
    }
}
