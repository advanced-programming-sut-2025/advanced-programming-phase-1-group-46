package models.buildings;

public class JojoMart extends Shop {
    private static JojoMart jojoMart;
    public static JojoMart getInstance() {
        if (jojoMart == null) {
            jojoMart = new JojoMart();
        }
        return jojoMart;
    }
}
