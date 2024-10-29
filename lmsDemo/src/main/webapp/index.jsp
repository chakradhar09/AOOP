<!DOCTYPE html>
<html>
<head>
    <title>Library Management System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            display: flex; /* Use flexbox for layout */
            height: 100vh; /* Full height of the viewport */
        }
        .image-container {
            flex: 1; /* Take up one part of the flex container */
            background: url('bookshelf.jpg') no-repeat center center;
            background-size: cover; /* Cover the entire div */
        }
        .content-container {
            flex: 1; /* Take up the other part of the flex container */
            display: flex;
            flex-direction: column; /* Align items vertically */
            justify-content: center; /* Center content vertically */
            align-items: center; /* Center content horizontally */
            background-color: rgba(244, 244, 244, 0.9); /* Light background for contrast */
            padding: 20px; /* Add some padding */
        }
        h1 {
            color: #333; /* Dark color for the header */
        }
        .nav-links {
            margin-top: 20px;
        }
        .nav-links a {
            display: inline-block;
            margin: 10px;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        .nav-links a:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<div class="image-container"></div> <!-- Image container -->
<div class="content-container">
    <h1>Welcome to the Library Management System</h1>
    <p>Manage books, members, and borrowing records seamlessly.</p>

    <div class="nav-links">
        <a href="displayBooks.jsp">View All Books</a>
        <a href="addBook.jsp">Add a New Book</a>
    </div>
</div>
</body>
</html>
