// ReturnBookServlet.java
package org.example.lmsdemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

public class ReturnBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int bookId = Integer.parseInt(request.getParameter("bookId"));

        BookDAO bookDAO = new BookDAO();
        BorrowingDAO borrowingDAO = new BorrowingDAO();

        try {
            bookDAO.updateAvailability(bookId, true);
            borrowingDAO.returnBook(bookId);
            response.sendRedirect("BookServlet");
        } catch (SQLException | ClassNotFoundException e) {
            response.getWriter().println("Error returning book: " + e.getMessage());
        }
    }
}
