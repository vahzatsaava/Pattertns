package Pattertns.behavior.chain_of_resposibility.atm_mashine;

public interface DispenseChain {
     void setNextChain(DispenseChain dispenseChain);
     void dispense(Currency currency);
}
