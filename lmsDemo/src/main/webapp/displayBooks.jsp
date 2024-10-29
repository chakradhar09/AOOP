<%@ page import="java.util.List" %>
<%@ page import="org.example.lmsdemo.Book" %>
<%@ page import="org.example.lmsdemo.BookDAO" %>

<%
    BookDAO bookDAO = new BookDAO();
    List<Book> books = bookDAO.getAllBooks();
%>

<!DOCTYPE html>
<html>
<head>
    <title>Library Books</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        h1 {
            color: #333;
        }
        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px 0;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #ddd;
        }
        form {
            display: inline;
        }
        input[type="text"] {
            padding: 5px;
            margin-right: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        button {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 5px 10px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 14px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 3px;
        }
        button:hover {
            background-color: #45a049;
        }
        a {
            color: #4CAF50;
            text-decoration: none;
            font-weight: bold;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<h1>Library Books</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Genre</th>
        <th>Available</th>
        <th>Actions</th>
    </tr>
    <%
        for (Book book : books) {
    %>
    <tr>
        <td><%= book.getId() %></td>
        <td><%= book.getTitle() %></td>
        <td><%= book.getAuthor() %></td>
        <td><%= book.getGenre() %></td>
        <td><%= book.isAvailable() ? "Yes" : "No" %></td>
        <td>
            <% if (book.isAvailable()) { %>
            <form action="BorrowBookServlet" method="post" style="display:inline;">
                <input type="hidden" name="bookId" value="<%= book.getId() %>">
                <input type="text" name="memberId" placeholder="Enter Member ID" required>
                <button type="submit">Borrow</button>
            </form>
            <% } else { %>
            <form action="ReturnBookServlet" method="post" style="display:inline;">
                <input type="hidden" name="bookId" value="<%= book.getId() %>">
                <button type="submit">Return</button>
            </form>
            <% } %>
        </td>
    </tr>
    <%
        }
    %>
</table>
<br>
<a href="addBook.jsp">Add a New Book</a>
</body>
</html>
