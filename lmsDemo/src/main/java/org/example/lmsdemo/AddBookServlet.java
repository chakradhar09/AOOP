// AddBookServlet.java
package org.example.lmsdemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

public class AddBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String genre = request.getParameter("genre");
        boolean available = true;

        BookDAO bookDAO = new BookDAO();
        try {
            Book newBook = new Book(0, title, author, genre, available);
            bookDAO.addBook(newBook);
            response.sendRedirect("BookServlet");
        } catch (SQLException e) {
            response.getWriter().println("Error adding book: " + e.getMessage());
        }
    }
}
