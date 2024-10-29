package org.example.lmsdemo;// BookDAO.java

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getAllBooks() throws SQLException, ClassNotFoundException {
        List<Book> books = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        String query = "SELECT * FROM Books";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            books.add(new Book(rs.getInt("book_id"), rs.getString("title"), rs.getString("author"), rs.getString("genre"), rs.getBoolean("available")));
        }
        conn.close();
        return books;
    }

    // Other methods like addBook, updateBook, deleteBook
    // Add this code to BookDAO.java
    public void addBook(Book book) throws SQLException {
        String query = "INSERT INTO Books (title, author, genre, available) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setString(3, book.getGenre());
            stmt.setBoolean(4, book.isAvailable());
            stmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Book getBookById(int bookId) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM Books WHERE book_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, bookId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Book(rs.getInt("book_id"), rs.getString("title"), rs.getString("author"), rs.getString("genre"), rs.getBoolean("available"));
            }
        }
        return null;
    }

    public void updateAvailability(int bookId, boolean available) throws SQLException, ClassNotFoundException {
        String query = "UPDATE Books SET available = ? WHERE book_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setBoolean(1, available);
            stmt.setInt(2, bookId);
            stmt.executeUpdate();
        }
    }

}
