package nz.net.osnz.servlet;

import org.apache.http.HttpStatus;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kefeng Deng (deng@51any.com)
 */
@WebServlet(
    name = "healthCheck",
    description = "Health Check Servlet",
    urlPatterns = {"/_ah/health"}
)
public class HealthCheckServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");
        response.getWriter().println("OK");
        response.setStatus(HttpStatus.SC_OK);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");
        response.getWriter().println("OK");
        response.setStatus(HttpStatus.SC_OK);
    }

}
