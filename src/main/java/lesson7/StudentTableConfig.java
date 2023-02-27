package lesson7;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(urlPatterns = "/student/*")

public class StudentTableConfig extends HttpServlet {
        private static final Pattern PARAM_PATTERN = Pattern.compile("\\/(\\d+)");
        private StudentRepositoryImpl studentRepositoryImpl;

        @Override
        public void init() throws ServletException {
            this.studentRepositoryImpl = (StudentRepositoryImpl) getServletContext().getAttribute("studentRepository");
        }




        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            Student student;
            String pathInfo = req.getPathInfo();
            String contextPath = req.getContextPath();
            resp.getWriter().println("request.getPathInfo() " + "<p>" + pathInfo + "</p>");
            resp.getWriter().println("request.getContextPath() " + "<p>" + contextPath + "</p>");
            if (req.getPathInfo() == null || req.getPathInfo().equals("/")) {
                PrintWriter wr = resp.getWriter();
                wr.println("<table>");
                wr.println("<tr>");
                wr.println("<th>id</th>");
                wr.println("<th>name</th>");
                wr.println("<th>age</th>");
                wr.println("</tr>");

                for (Student students: StudentRepositoryImpl.findAll()) {
                    wr.println("<tr>");
                    wr.println("<td><a href='" + req.getContextPath() + "/student/" + students.getId() + "'>" + students.getId() + "</a></td>");
                    wr.println("<td>" + students.getName() + "</td>");
                    wr.println("</tr>");
                }

                wr.println("</table>");
            } else {


                {
                    Matcher matcher = PARAM_PATTERN.matcher(req.getPathInfo());
                    if (matcher.matches()) {
                        long id = Long.parseLong(matcher.group(1));
                        student = StudentRepositoryImpl.findById(id);
                        if (student == null) {
                            resp.getWriter().println("Student not found");
                            resp.setStatus(404);
                            return;
                        }
                        req.setAttribute("student", StudentRepositoryImpl.findById(id));
                        getServletContext().getRequestDispatcher("/student.jsp").forward(req, resp);;
                    } else {
                        resp.getWriter().println("Bad parameter value");
                        resp.setStatus(400);
                    }
                }
            }
        }
    }



