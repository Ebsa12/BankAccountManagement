/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ebsa_jarso_assignmentt_2;

/**
 *
 * @author ebsak
 */
public interface BankAccountInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    String getOwner();
}
