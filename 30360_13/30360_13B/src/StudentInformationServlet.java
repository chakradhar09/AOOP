import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/StudentInformationServlet")
public class StudentInformationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        // Set response content type
        response.setContentType("text/html");

        // Get student details from the form
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String program = request.getParameter("program");
        String branch = request.getParameter("branch");

        PrintWriter out = response.getWriter();

        // Database connection parameters
        String url = "jdbc:postgresql://localhost:5432/students";
        String username = "root";
        String password = "goldenhand";  // Replace with your MySQL password

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish connection
            con = DriverManager.getConnection(url, username, password);

            // Prepare SQL INSERT statement
            String insertSQL = "insert into studentRegistration (id, name, program, branch) values(?, ?, ?, ?)";
            pstmt = con.prepareStatement(insertSQL);

            // Set values
            pstmt.setInt(1, Integer.parseInt(id));
            pstmt.setString(2, name);
            pstmt.setString(3, program);
            pstmt.setString(4, branch);

            // Execute the insert statement
            int result = pstmt.executeUpdate();

            if (result > 0) {
                out.println("<h3>Student record inserted successfully!</h3>");
            } else {
                out.println("<h3>Error inserting student record!</h3>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
