package com.masai.usecases;

import com.masai.dao.BookDAOImpl;
import com.masai.exception.BookException;
import com.masai.models.Book;
import com.masai.utility.ProvideConnection;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class GetBookById {
    public static void main(String[] args) {
        EntityManager em = ProvideConnection.getConnection();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        int id = sc.nextInt();
        BookDAOImpl BookImpl = new BookDAOImpl();
        try {
            Book book = BookImpl.getBookById(id);
            System.out.println(book);
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }
    }
}
