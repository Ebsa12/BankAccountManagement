/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ebsa_jarso_assignmentt_2;

/**
 *
 * @author ebsak
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ebsa_Jarso_Assignmentt_2 {
    private static CheckingAccount checking;
    private static SavingsAccount savings;

    public static void main(String[] args) {
        // Create instances of CheckingAccount and SavingsAccount
        checking = new CheckingAccount("Alice", 500.0, 35.0);
        savings = new SavingsAccount("Bob", 1000.0, 3.0);

        // Create and set up the window
        JFrame frame = new JFrame("Bank Account Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2));

        // Create GUI components
        JLabel checkingBalanceLabel = new JLabel("Checking Balance: $" + checking.getBalance());
        JLabel savingsBalanceLabel = new JLabel("Savings Balance: $" + savings.getBalance());

        JTextField checkingDepositField = new JTextField();
        JTextField checkingWithdrawField = new JTextField();
        JTextField savingsDepositField = new JTextField();

        JButton checkDepositButton = new JButton("Deposit to Checking");
        JButton checkWithdrawButton = new JButton("Withdraw from Checking");
        JButton saveDepositButton = new JButton("Deposit to Savings");
        JButton applyInterestButton = new JButton("Apply Interest to Savings");

        // Action Listeners for buttons
        checkDepositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(checkingDepositField.getText());
                checking.deposit(amount);
                checkingBalanceLabel.setText("Checking Balance: $" + checking.getBalance());
            }
        });

        checkWithdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(checkingWithdrawField.getText());
                checking.withdraw(amount);
                checkingBalanceLabel.setText("Checking Balance: $" + checking.getBalance());
            }
        });

        saveDepositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(savingsDepositField.getText());
                savings.deposit(amount);
                savingsBalanceLabel.setText("Savings Balance: $" + savings.getBalance());
            }
        });

        applyInterestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savings.depositMonthlyInterest();
                savingsBalanceLabel.setText("Savings Balance: $" + savings.getBalance());
            }
        });

        // Add components to the frame
        frame.add(checkingBalanceLabel);
        frame.add(savingsBalanceLabel);
        frame.add(new JLabel("Deposit to Checking:"));
        frame.add(checkingDepositField);
        frame.add(new JLabel("Withdraw from Checking:"));
        frame.add(checkingWithdrawField);
        frame.add(checkDepositButton);
        frame.add(checkWithdrawButton);
        frame.add(new JLabel("Deposit to Savings:"));
        frame.add(savingsDepositField);
        frame.add(saveDepositButton);
        frame.add(applyInterestButton);

        // Display the window
        frame.setVisible(true);
    }
}
