import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.Serial;

@WebServlet("/UserInputServlet")
public class UserInputServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type of the response
        response.setContentType("text/html");

        // Retrieve user input from the request
        String name = request.getParameter("name");
        String color = request.getParameter("color");

        // Prepare the response message
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        // Create a customized response
        out.println("<h2>Hello " + name + "!</h2>");
        out.println("<p>Your favorite color is " + color + ".</p>");
        out.println("<p>Thank you for sharing your preferences!</p>");

        out.println("</body></html>");
        out.close();
    }
}
