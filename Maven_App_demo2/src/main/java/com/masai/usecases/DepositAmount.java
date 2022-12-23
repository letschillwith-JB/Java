package com.masai.usecases;

import com.masai.dao.StateBankDAOImpl;
import com.masai.exception.StateBankException;

import java.util.Scanner;

public class DepositAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter AccountId");
        int accountId = sc.nextInt();

        System.out.println("Enter amount to withdraw");
        double amount = sc.nextDouble();

        StateBankDAOImpl stateBankDAO = new StateBankDAOImpl();

        try {
            String messsage = stateBankDAO.depositInAccount(amount,accountId);
            System.out.println(messsage);
        } catch (StateBankException e) {
            System.out.println(e.getMessage());
        }

    }
}
