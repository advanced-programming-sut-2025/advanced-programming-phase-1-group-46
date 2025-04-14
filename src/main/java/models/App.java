package models;

import models.enums.Menu;

import java.util.ArrayList;

public class App {
    private static final ArrayList<User> user = new ArrayList<>();
    private static Menu currentMenu;
    private static final Game game = new Game();

    public static Menu getCurrentMenu() {return currentMenu;}

    public static void setCurrentMenu(Menu currentMenu) {App.currentMenu = currentMenu;}

    private void importUsers(){};
    private Game startGame(int id){return null;};
    private User currentUser;
    public static void addUser(User user) {
        App.user.add(user);
    }


}
