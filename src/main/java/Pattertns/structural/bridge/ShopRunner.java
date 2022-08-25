package Pattertns.structural.bridge;

public class ShopRunner {
    public static void main(String[] args) {
        Shop[] shops = {new AutoSalon(new CarsSeller()),new Market(new MeetSeller())};

        for (var i:shops) {
            i.sellThings();
        }
    }
}
