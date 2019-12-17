package com.mycompany.projekt_to_aleksander_nosal;

public class ProxyAccount implements AccountOperations {
    private RealAccount account;

    public ProxyAccount(Integer amount){
        this.account = new RealAccount(amount);
    }

    public void operations(String oper, Integer amount) {
        try{
            if(oper.equals("w"))
                account.withDraw(amount);
            else if(oper.equals("d"))
                account.deposite(amount);
            else throw new Exception();
        }catch (Exception e){
            System.out.println("No such operation");
        }
    }

    @Override
    public void DisplayBalance() {
        account.DisplayBalance();
    }

    public Integer yourBalance() {
        return this.account.yourBalance();
    }
}
