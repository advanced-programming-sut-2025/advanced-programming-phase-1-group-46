package models.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum GameMenuCommands implements Command {
    ENTER_MENU(""),
    EXIT_MENU(""),
    SHOW_CURRENT_MENU(""),
    NEW_GAME(""),
    LOAD_GAME(""),
    EXIT_GAME(""),
    DELETE_GAME(""),
    NEXT_TURN(""),
    SHOW_TIME(""),
    SHOW_DATE(""),
    SHOW_DATE_TIME(""),
    SHOW_DAY_OF_THE_WEEK(""),
    CHEAT_ADVANCE_TIME(""),
    CHEAT_ADVANCE_DATE(""),
    SHOW_SEASON(""),
    CHEAT_THOR(""),
    SHOW_WEATHER(""),
    FORECAST_WEATHER(""),
    CHEAT_WEATHER_SET(""),
    BUILD_GREENHOUSE(""),
    WALK(""),
    PRINT_MAP(""),
    HELP_READING_MAP(""),
    SHOW_ENERGY(""),
    CHEAT_SET_ENERGY(""),
    CHEAT_UNLIMITED_ENERGY(""),
    SHOW_INVENTORY(""),
    DELETE_FROM_INVENTORY(""),
    EQUIP_TOOL(""),
    SHOW_CURRENT_TOOL(""),
    SHOW_AVAILABLE_TOOL(""),
    UPGRADE_TOOL(""),
    USE_TOOL(""),
    SHOW_CRAFT_INFO(""),
    PLANT(""),
    SHOW_PLANT_INFO(""),
    FERTILIZE(""),
    HOW_MUCH_WATER_IN_BUCKET(""),
    SHOW_CRAFTING_RECIPES(""),
    CRAFT_ITEM(""),
    PLACE_ITEM_ON_GROUND(""),
    CHEAT_ADD_ITEM(""),
    PUT_INTO_REFRIGERATOR(""),
    PICK_FROM_REFRIGERATOR(""),
    SHOW_COOKING_RECIPES(""),
    PREPARE_FOOD_RECIPE(""),
    EAT_FOOD(""),
    BUILD_BUILDING(""),
    BUY_ANIMAL(""),
    PET_ANIMAL(""),
    CHEAT_SET_ANIMAL_FRIENDSHIP_LEVEL(""),
    SHOW_ALL_ANIMALS(""),
    SHEPHERD_ANIMAL(""),
    FEED_ANIMAL(""),
    SHOW_REMAINING_ANIMAL_PRODUCTS(""),
    COLLECT_ANIMAL_PRODUCTS(""),
    SELL_ANIMAL(""),
    START_FISHING(""),
    USE_ARTISAN(""),
    GET_FROM_ARTISAN(""),
    SHOW_ALL_PRODUCTS(""),
    SHOW_ALL_AVAILABLE_PRODUCTS(""),
    PURCHASE_PRODUCT(""),
    CHEAT_ADD_MONEY(""),
    SELL_PRODUCT(""),
    SHOW_FRIENDSHIP_LEVELS(""),
    TALK(""),
    SHOW_TALK_HISTORY(""),
    SEND_GIFT(""),
    SHOW_RECEIVED_GIFT_LIST(""),
    RATE_GIFT(""),
    SHOW_ALL_GIFTS_HISTORY(""),
    HUG(""),
    BUY_FLOWER(""),
    ASK_FOR_MARRIAGE(""),
    RESPOND_TO_MARRIAGE_REQUEST(""),
    START_TRADE(""),
    TRADE(""),
    SHOW_TRADES_LIST(""),
    RESPOND_TO_TRADE(""),
    SHOW_TRADE_HISTORY(""),
    MEET_NPC(""),
    GIVE_GIFT_TO_NPC(""),
    LIST_NPC_FRIENDSHIP_LEVELS(""),
    SHOW_QUESTS_LIST(""),
    FIND_QUEST("");

    private final String regexPattern;

    GameMenuCommands(String regexPattern) {
        this.regexPattern = regexPattern;
    }

    @Override
    public Matcher getMatcher(String command) {
        Matcher matcher = Pattern.compile(regexPattern).matcher(command);
        return matcher.matches() ? matcher : null;
    }

    public String getRegexPattern() {
        return regexPattern;
    }
}
