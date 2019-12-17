package com.mycompany.projekt_to_aleksander_nosal;

public class RealAccount implements AccountOperations {
    private Integer balance;

    public RealAccount(Integer balance) {
        this.balance = balance;
    }

    @Override
    public void DisplayBalance() {
        System.out.println("Your balance: " + this.balance);
    }

    public void withDraw(Integer amount) {
        this.balance = this.balance - amount;
    }

    public void deposite(Integer amount) {
        this.balance += amount;
    }

    public Integer yourBalance(){
        return this.balance;
    }
}
