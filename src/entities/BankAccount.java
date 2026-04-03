package entities;

import java.sql.SQLOutput;

public class BankAccount {
    private int accountNumber;
    private String titularNameAccount;
    private double value;

    public BankAccount(){}
    public BankAccount(int accountNumber, String titularNameAccount, double value) {
        this.accountNumber = accountNumber;
        this.titularNameAccount = titularNameAccount;
        deposit(value);
    }

    public BankAccount(int accountNumber, String titularNameAccount) {
        this.accountNumber = accountNumber;
        this.titularNameAccount = titularNameAccount;

        //Optional
        value = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getTitularNameAccount() {
        return titularNameAccount;
    }

    public double getValue() {
        return value;
    }

    public void setTitularNameAccount(String titularNameAccount) {
        this.titularNameAccount = titularNameAccount;
    }

    public void deposit(double valueOfDeposit){
        if (valueOfDeposit <0){
            System.out.println("ERROR: Isn't possible deposit any amount under U$ 0.00");
        } else {
            this.value += valueOfDeposit;
            System.out.println("Deposit OK!");
        }
    }

    public void withdrawValue(double valueOfWithdraw){
        if (valueOfWithdraw <0) {
            System.out.println("ERROR: Isn't possible any withdraw under U$ 0.00");
        } else if (valueOfWithdraw >value) {
            System.out.println("ERROR: value of withdraw is upper to value of your balance");
        } else{
            double rate = 5.00;
            double totalOfWithdraw = valueOfWithdraw + rate;
            value-= totalOfWithdraw;
            System.out.println("Withdraw OK!");
        }

    }

    @Override
    public String toString(){
        return "Account Number: "
                + accountNumber
                + " | Name of titular account: "
                + titularNameAccount
                + " | Amount: $ "
                + String.format("%.2f", value)
                ;
    }


}



