package com.masai.usecases;

import com.masai.dao.BookDAOImpl;
import com.masai.exception.BookException;

import java.util.Scanner;

public class RemoveBookById {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id of the book");
        int id = sc.nextInt();
        BookDAOImpl bookDAO = new BookDAOImpl();
        try {
            String output = bookDAO.deleteBookById(id);
            System.out.println(output);
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }

    }
}
