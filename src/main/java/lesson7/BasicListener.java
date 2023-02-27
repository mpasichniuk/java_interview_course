package lesson7;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener

public class BasicListener implements ServletContextListener {

        @Override
        public void contextInitialized(ServletContextEvent sce) {
            StudentRepository studentRepository = new StudentRepositoryImpl();
            studentRepository.insert(new Student("Mary", 1));
            studentRepository.insert(new Student("Anton", 4));
            studentRepository.insert(new Student("Ivan", 6));
            studentRepository.insert(new Student("Kiril", 9));
            studentRepository.insert(new Student("Yulia", 12));
            sce.getServletContext().setAttribute("productRepository", studentRepository);
        }

    }


