// BorrowBookServlet.java
package org.example.lmsdemo;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

public class BorrowBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int bookId = Integer.parseInt(request.getParameter("bookId"));
        int memberId = Integer.parseInt(request.getParameter("memberId"));

        BookDAO bookDAO = new BookDAO();
        BorrowingDAO borrowingDAO = new BorrowingDAO();

        try {
            Book book = bookDAO.getBookById(bookId);
            if (book.isAvailable()) {
                bookDAO.updateAvailability(bookId, false);
                borrowingDAO.borrowBook(bookId, memberId);
                response.sendRedirect("BookServlet");
            } else {
                response.getWriter().println("Book is already borrowed.");
            }
        } catch (SQLException e) {
            response.getWriter().println("Error borrowing book: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
