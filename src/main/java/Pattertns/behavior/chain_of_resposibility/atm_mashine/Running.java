package Pattertns.behavior.chain_of_resposibility.atm_mashine;

import java.util.Scanner;

public class Running {

    public static void main(String[] args) {
            AtmDispenceChain chain = new AtmDispenceChain();
            while (true){
                int amount  = 0;
                System.out.println("Enter amount to dispense");
                Scanner scanner = new Scanner(System.in);
                amount = scanner.nextInt();
                if (amount % 10 != 0){
                    System.out.println("Amount should be in multiple of 10s.");
                    return;
                }
                chain.getChain().dispense(new Currency(amount));
            }
    }
}
