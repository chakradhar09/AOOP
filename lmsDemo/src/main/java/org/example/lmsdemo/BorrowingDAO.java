// BorrowingDAO.java
package org.example.lmsdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class BorrowingDAO {
    public void borrowBook(int bookId, int memberId) throws SQLException {
        String query = "INSERT INTO Borrowing (book_id, member_id, borrow_date) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, bookId);
            stmt.setInt(2, memberId);
            stmt.setDate(3, new Date(System.currentTimeMillis()));
            stmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void returnBook(int bookId) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM Borrowing WHERE book_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, bookId);
            stmt.executeUpdate();
        }
    }
}
