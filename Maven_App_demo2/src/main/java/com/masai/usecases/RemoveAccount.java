package com.masai.usecases;

import com.masai.dao.StateBankDAOImpl;
import com.masai.exception.StateBankException;

import java.util.Scanner;

public class RemoveAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id to remove");
        int id = sc.nextInt();
        StateBankDAOImpl stateBankDAO = new StateBankDAOImpl();
        try {
           String out = stateBankDAO.deleteAccountById(id);
            System.out.println(out);
        } catch (StateBankException e) {
            System.out.println(e.getMessage());
        }
    }
}
