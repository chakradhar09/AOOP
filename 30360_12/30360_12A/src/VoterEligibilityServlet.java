import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/VoterEligibilityServlet")
public class VoterEligibilityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name = request.getParameter("name");
        String ageString = request.getParameter("age");

        PrintWriter out = response.getWriter();

        try{
            int age = Integer.parseInt(ageString);

            out.println("<html><body>");
            out.println("<h1>Voter Eligibility Result</h1>");

            if (age >= 18)
                out.println("<p>Hello " + name + ", you are eligible to vote!</p>");
            else
                out.println("<p>Hello " + name + ", you are not eligible to vote yet.</p>");

            out.println("</body></html>");
        }
        catch(NumberFormatException e){ //Handle invalid input(non-numeric age)
            out.println("<html><body>");
            out.println("<h1>Error</h1>");
            out.println("<p>Invalid input: Please enter a valid number for age.</p>");
            out.println("</body></html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.sendRedirect("Index.jsp");
    }
}
