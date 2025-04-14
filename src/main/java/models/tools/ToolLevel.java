package models.tools;

public enum ToolLevel {
    BASIC(0),
    COPPER(1),
    IRON(2),
    GOLD(3),
    IRIDIUM(4);
    private final int level;
    ToolLevel(int level) {
        this.level = level;
    }

}
