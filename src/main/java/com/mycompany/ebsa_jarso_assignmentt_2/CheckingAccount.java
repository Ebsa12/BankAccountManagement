/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ebsa_jarso_assignmentt_2;

/**
 *
 * @author ebsak
 */
public class CheckingAccount extends BankAccount {
    private double insufficientFundsFee;

    public CheckingAccount(String owner, double balance, double insufficientFundsFee) {
        super(owner, balance);
        this.insufficientFundsFee = insufficientFundsFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            balance -= insufficientFundsFee; // Penalty for insufficient funds
        } else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Insufficient Funds Fee: $" + insufficientFundsFee;
    }
}
