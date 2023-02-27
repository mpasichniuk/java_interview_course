package lesson6;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/first_servlet")
public abstract class FirstServlet implements Servlet {

        private FirstServlet config;


        @Override
        public ServletConfig getServletConfig() {
            return (ServletConfig) config;
        }

        @Override
        public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
            res.getWriter().println("<h1>Hello World!</h1>");
        }

        @Override
        public String getServletInfo() {
            return null;
        }

        @Override
        public void destroy() {

        }
    }

