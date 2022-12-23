package com.masai.usecases;

import com.masai.dao.StateBankDAOImpl;
import com.masai.model.Account;

import java.time.LocalDate;
import java.util.Scanner;

public class SaveAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account();

        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter Balance");
        double balance = sc.nextInt();

        account.setBalance(balance);
        account.setEmail(email);
        account.setCreated_date(LocalDate.now());

        StateBankDAOImpl stateBankDAO = new StateBankDAOImpl();
        String out = stateBankDAO.saveAccount(account);

        System.out.println(out);
    }
}
