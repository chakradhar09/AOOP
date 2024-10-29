<!DOCTYPE html>
<html>
<head>
    <title>Add New Book</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex; /* Center content */
            flex-direction: column; /* Stack elements vertically */
            align-items: center; /* Center elements horizontally */
            justify-content: center; /* Center elements vertically */
            height: 100vh; /* Full height of the viewport */
            margin: 0; /* Remove default margin */
        }
        h1 {
            color: #333; /* Dark color for the header */
            margin-bottom: 20px; /* Space below the header */
        }
        form {
            background-color: #fff; /* White background for the form */
            padding: 20px; /* Inner spacing */
            border-radius: 8px; /* Rounded corners */
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1); /* Subtle shadow for depth */
            width: 300px; /* Fixed width for the form */
            text-align: left; /* Left-align text in the form */
        }
        label {
            display: block; /* Block-level for labels */
            margin-bottom: 5px; /* Space below each label */
            font-weight: bold; /* Bold text for labels */
        }
        input[type="text"] {
            width: 100%; /* Full width of the container */
            padding: 8px; /* Inner spacing */
            margin-bottom: 15px; /* Space below each input */
            border: 1px solid #ddd; /* Light border */
            border-radius: 4px; /* Rounded corners */
        }
        button {
            background-color: #4CAF50; /* Green background */
            color: white; /* White text */
            border: none; /* No border */
            padding: 10px; /* Inner spacing */
            font-size: 16px; /* Font size */
            font-weight: bold; /* Bold text */
            border-radius: 4px; /* Rounded corners */
            cursor: pointer; /* Pointer cursor on hover */
            transition: background-color 0.3s ease; /* Smooth transition */
        }
        button:hover {
            background-color: #45a049; /* Darker green on hover */
        }
        a {
            margin-top: 20px; /* Space above the link */
            text-decoration: none; /* Remove underline */
            color: #007BFF; /* Blue color for the link */
            font-weight: bold; /* Bold text */
        }
        a:hover {
            text-decoration: underline; /* Underline on hover */
        }
    </style>
</head>
<body>
<h1>Add a New Book</h1>
<form action="AddBookServlet" method="post">
    <label for="title">Title:</label>
    <input type="text" name="title" id="title" required>

    <label for="author">Author:</label>
    <input type="text" name="author" id="author" required>

    <label for="genre">Genre:</label>
    <input type="text" name="genre" id="genre" required>

    <button type="submit">Add Book</button>
</form>
<a href="displayBooks.jsp">Back to Book List</a>
</body>
</html>
