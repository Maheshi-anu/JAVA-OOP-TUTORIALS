package Q3;

import java.util.concurrent.Callable;

public class BankAccount implements Comparable<BankAccount> {
    private double balance;


    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    @Override
    public int compareTo(BankAccount bankAccount) {
        if (bankAccount.balance > balance){
            return 1;
        }
        if (bankAccount.balance == balance){
            return 0;
        }
        else{
            return -1;
        }
    }

}
