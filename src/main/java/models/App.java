package models;

import models.enums.Menu;

import java.util.ArrayList;

public class App {
    private static ArrayList<User> user = new ArrayList<>();
    private static Menu currentMenu;
    private static Game game = new Game();

    public static Menu getCurrentMenu() {return currentMenu;}

    public static void setCurrentMenu(Menu currentMenu) {App.currentMenu = currentMenu;}

    private void importUsers();
    private Game startGame(int id);
    private User currentUser;


}
