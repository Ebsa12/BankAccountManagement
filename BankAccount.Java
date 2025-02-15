/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ebsa_jarso_assignmentt_2;

/**
 *
 * @author ebsak
 */
public abstract class BankAccount implements BankAccountInterface {
    protected String owner;
    protected double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return "Owner: " + owner + ", Balance: $" + balance;
    }
}

