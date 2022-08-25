package Pattertns.behavior.chain_of_resposibility.atm_mashine;

public class AtmDispenceChain {
    private DispenseChain chain;
    AtmDispenceChain(){
        this.chain = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
        chain.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public DispenseChain getChain() {
        return chain;
    }
}
