package Pattertns.structural.bridge;

public class Market extends Shop{

    protected Market(Seller seller) {
        super(seller);
    }

    @Override
    public void sellThings() {
        System.out.println("Market work about 1 hours");
        seller.sell();
    }
}
