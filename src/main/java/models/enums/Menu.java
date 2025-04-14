package models.enums;

import models.Result;
import views.*;

import java.util.Scanner;

public enum Menu {
    REGISTER_MENU(new RegisterMenu()),
    LOGIN_MENU(new LoginMenu()),
    MAIN_MENU(new MainMenu()),
    GAME_MENU(new GameMenu()),
    PROFILE_MENU(new ProfileMenu()),
    EXIT_MENU(new ExitMenu());

    private final AppMenu menu;

    Menu(final AppMenu menu) {
        this.menu = menu;
    }

    public Result checkCommand(Scanner scanner) {
        return this.menu.check(scanner);
    }
}
