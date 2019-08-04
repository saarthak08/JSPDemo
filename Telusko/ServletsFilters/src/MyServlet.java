import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

@WebServlet("/addAlien")
public class MyServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter writer=response.getWriter();
        int aid=Integer.parseInt(request.getParameter("aid"));
        String aname =request.getParameter("aname");
        writer.println("Hello! "+aname);
    }
}
