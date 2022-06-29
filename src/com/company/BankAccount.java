package com.company;

public class BankAccount {
    private String accountName;
    private float balance = 0f;

    public BankAccount() {
    }

    public BankAccount(String accountName) {
        this.accountName = accountName;
    }

    public float deposit(float amount) {
        if (amount >= 5000) {
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: " + amount);
        } else balance += amount;
        return balance;
    }

    public float withdraw(float amount) {
        if (amount > balance) {
            System.out.println("There is not enough funds");
        } else balance -= amount ;
        return balance;
    }

    public void printBalance() {
        System.out.println("Your current balance is: " + balance);
    }
    public float transferMoney(BankAccount transferTo, int amount) {
        if (amount > balance) {
            System.out.println("Transfer canceled. You are trying to transfer more money than are available.");
        } else transferTo.deposit(amount);
        withdraw(amount);
        return balance;
    }

    public static void main(String[] args) {
        BankAccount inga = new BankAccount("IJ");
        BankAccount mia = new BankAccount("MI");
        inga.deposit(2000);
        mia.deposit(1000);
        inga.withdraw(1000);
        mia.withdraw(200);

        inga.transferMoney(mia,300);

        inga.printBalance();
        mia.printBalance();
    }

}
