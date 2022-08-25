package Pattertns.structural.bridge;

public class AutoSalon extends Shop{
    public AutoSalon(Seller seller) {
        super(seller);
    }

    @Override
    public void sellThings() {
        System.out.println("Salon sell all products");
        seller.sell();
    }
}
