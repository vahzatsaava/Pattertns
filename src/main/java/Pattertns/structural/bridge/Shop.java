package Pattertns.structural.bridge;

public abstract class Shop {
    protected Seller seller;

    protected Shop(Seller seller) {
        this.seller = seller;
    }
    public abstract void sellThings();
}
