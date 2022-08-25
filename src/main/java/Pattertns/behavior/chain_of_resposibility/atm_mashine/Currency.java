package Pattertns.behavior.chain_of_resposibility.atm_mashine;

/**
 * current amount in machine
 */
public class Currency {
    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
