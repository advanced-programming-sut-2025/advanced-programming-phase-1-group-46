package views;

import models.*;
import models.enums.*;
import java.util.Scanner;

public class AppView {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        do {
            String message = App.getCurrentMenu().checkCommand(scanner).message();
        } while (App.getCurrentMenu() != Menu.EXIT_MENU);
    }

    public static Result exit() {
        App.setCurrentMenu(Menu.EXIT_MENU);
        return new Result(true, "");
    }
}
