import java.io.*;
import java.time.LocalDate;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name ="Datetime-Servlet", value = "/datetime-servlet")
public class DateTimeServlet extends HttpServlet {

    public void init()
    {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        response.setContentType("text/html");
        LocalDate now = LocalDate.now();
        // response to client
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<body>");
        printWriter.println("<h2>"+now+"</h2>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }

    public void destroy() {
    }
}