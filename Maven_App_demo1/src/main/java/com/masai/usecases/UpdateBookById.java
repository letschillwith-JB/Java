package com.masai.usecases;

import com.masai.dao.BookDAOImpl;
import com.masai.exception.BookException;
import com.masai.models.Book;

import java.time.LocalDateTime;
import java.util.Scanner;

public class UpdateBookById {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id of book which you want to update");
        int bookId = sc.nextInt();

        BookDAOImpl bookDAO = new BookDAOImpl();
        try {
            String ans = bookDAO.updateBookById(bookId);
            System.out.println(ans);
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }
    }
}
