/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ebsa_jarso_assignmentt_2;

/**
 *
 * @author ebsak
 */
public class SavingsAccount extends BankAccount {
    private double annualInterestRate;

    public SavingsAccount(String owner, double balance, double annualInterestRate) {
        super(owner, balance);
        this.annualInterestRate = annualInterestRate;
    }

    public void depositMonthlyInterest() {
        balance += (balance * (annualInterestRate / 12) / 100);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Annual Interest Rate: " + annualInterestRate + "%";
    }
}

