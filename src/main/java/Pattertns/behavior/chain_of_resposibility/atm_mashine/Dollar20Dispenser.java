package Pattertns.behavior.chain_of_resposibility.atm_mashine;

public class Dollar20Dispenser implements DispenseChain{
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.chain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() > 20){
            int num = currency.getAmount() / 20;
            int rem = currency.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if (rem != 0){
                chain.dispense(new Currency(rem));
            }
        }
        else {
            chain.dispense(currency);
        }
    }
}
