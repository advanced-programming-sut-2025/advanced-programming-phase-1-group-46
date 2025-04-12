package models.enums;

import models.Result;
import views.*;

import java.util.Scanner;


public enum Menu {
    RegisterMenu(new RegisterMenu()),
    LoginMenu(new LoginMenu()),
    MainMenu(new MainMenu()),
    GameMenu(new GameMenu()),
    ProfileMenu(new ProfileMenu()),
    ExitMenu(new ExitMenu());
    private final AppMenu menu;

    Menu(final AppMenu menu) {this.menu = menu;}

    public Result checkCommand(Scanner scanner) {return this.menu.check(scanner);}
}
