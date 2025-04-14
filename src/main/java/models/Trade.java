package models;

public class Trade {
    int id;
    private boolean isOffer; //offer or request
    private int amount;
    private GameObject firstItem;

    private final int price = 0;
    private final GameObject targetItem = null;
    private final int targetAmount = 0;
}
