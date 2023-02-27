package lesson7;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener

public class BasicListener implements ServletContextListener {

        @Override
        public void contextInitialized(ServletContextEvent sce) {
            StudentRepository studentRepository = new StudentRepository();
            studentRepository.insert(new Student("Mary"));
            studentRepository.insert(new Student("Anton"));
            studentRepository.insert(new Student("Ivan"));
            studentRepository.insert(new Student("Kiril"));
            studentRepository.insert(new Product("Yulia));
            sce.getServletContext().setAttribute("productRepository", studentRepository);
        }

    }

}
